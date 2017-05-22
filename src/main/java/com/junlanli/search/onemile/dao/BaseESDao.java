package com.junlanli.search.onemile.dao;

import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public interface BaseESDao<E> {

    /**
     * get index name
     *
     * @return index name
     */
    String getIndexName();

    /**
     * get type name
     *
     * @return type name
     */
    String getType();

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
    String index(E entity);

    /**
     * update all index in a batch
     *
     * @param list new entity list
     */
    void bulkIndex(List<E> list);

}
