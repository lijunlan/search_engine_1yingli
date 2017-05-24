package com.junlanli.search.onemile.dao.repository.custom.impl;

import com.junlanli.search.onemile.dao.repository.custom.BaseESDao;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.aggregations.Aggregations;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ResultsExtractor;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.repository.support.AbstractElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.support.ElasticsearchEntityInformation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class BaseESDaoImpl<E, ID extends Serializable> extends AbstractElasticsearchRepository<E, ID> implements BaseESDao<E, ID> {

    public BaseESDaoImpl() {
        super();
    }

    public BaseESDaoImpl(ElasticsearchOperations elasticsearchOperations) {
        super(elasticsearchOperations);
    }

    public BaseESDaoImpl(ElasticsearchEntityInformation<E, ID> metadata, ElasticsearchOperations elasticsearchOperations) {
        super(metadata, elasticsearchOperations);
    }

    @Override
    public Boolean createIndex() {
        return elasticsearchOperations.createIndex(getEntityClass())
                && elasticsearchOperations.putMapping(getEntityClass());
    }

    @Override
    protected String stringIdRepresentation(ID id) {
        return id.toString();
    }

    @Override
    public String insertIndex(E entity) {
        IndexQueryBuilder builder = new IndexQueryBuilder();
        IndexQuery query = builder.withType(entityInformation.getType()).withIndexName(entityInformation.getIndexName()).withObject(entity).build();
        return elasticsearchOperations.index(query);
    }

    @Override
    public void bulkIndex(List<E> list) {
        List<IndexQuery> queryList = new ArrayList<>(list.size());
        for (E e : list) {
            IndexQueryBuilder builder = new IndexQueryBuilder();
            IndexQuery query = builder.withType(entityInformation.getType()).withIndexName(entityInformation.getIndexName()).withObject(e).build();
            queryList.add(query);
        }
        elasticsearchOperations.bulkIndex(queryList);
    }

    @Override
    public Aggregations aggregate(SearchQuery searchQuery) {
        Aggregations aggregations = elasticsearchOperations.query(searchQuery, new ResultsExtractor<Aggregations>() {
            @Override
            public Aggregations extract(SearchResponse response) {
                return response.getAggregations();
            }
        });
        return aggregations;
    }
}
