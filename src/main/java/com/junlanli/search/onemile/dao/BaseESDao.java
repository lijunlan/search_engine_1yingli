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

    String getIndexName();

    String getType();

    Boolean createIndex();

    String index(E entity);

    void bulkIndex(List<E> list);

}
