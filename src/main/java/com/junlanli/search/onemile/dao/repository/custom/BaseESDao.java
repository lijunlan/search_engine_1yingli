package com.junlanli.search.onemile.dao.repository.custom;

import org.elasticsearch.search.aggregations.Aggregations;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@NoRepositoryBean
public interface BaseESDao<E, ID extends Serializable> extends ElasticsearchRepository<E, ID> {

    /**
     * create | update index setting including mapping
     *
     * @return result of creation. {@code true} represent created successfully, {@code false} on the contrary
     */
    Boolean createIndex();

    /**
     * update index
     *
     * @param entity new entity data
     * @return response of request
     */
    String insertIndex(E entity);

    /**
     * update all index in a batch
     *
     * @param list new entity list
     */
    void bulkIndex(List<E> list);

    /**
     * aggregate the query
     *
     * @param searchQuery aggregation and query details
     * @return aggregation
     */
    Aggregations aggregate(SearchQuery searchQuery);

}
