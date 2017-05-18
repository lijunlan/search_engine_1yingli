package com.junlanli.search.onemile.dao.impl;

import com.junlanli.search.onemile.dao.BaseESDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.ElasticsearchException;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public abstract class BaseESDaoImpl<E> implements BaseESDao<E> {


    private ElasticsearchOperations elasticsearchOperations;

    public ElasticsearchOperations getElasticsearchOperations() {
        return elasticsearchOperations;
    }

    @Autowired
    public void setElasticsearchOperations(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    protected abstract Class<E> getEntityClass();

    @Override
    public String getIndexName() {
        return elasticsearchOperations.getPersistentEntityFor(getEntityClass()).getIndexName();
    }

    @Override
    public String getType() {
        return "test";
    }

    @Override
    public Boolean createIndex() {
        return elasticsearchOperations.createIndex(getEntityClass())
                && elasticsearchOperations.putMapping(getEntityClass());
    }

    @Override
    public String index(E entity) {
        IndexQueryBuilder builder = new IndexQueryBuilder();
        IndexQuery query = builder.withType(getType()).withIndexName(getIndexName()).withObject(entity).build();
        return elasticsearchOperations.index(query);
    }

    @Override
    public void bulkIndex(List<E> list) {
        List<IndexQuery> queryList = new ArrayList<>(list.size());
        for (E e : list) {
            IndexQueryBuilder builder = new IndexQueryBuilder();
            IndexQuery query = builder.withType(getType()).withIndexName(getIndexName()).withObject(e).build();
            queryList.add(query);
        }
        elasticsearchOperations.bulkIndex(queryList);
    }
}
