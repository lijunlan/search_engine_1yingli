package com.junlanli.search.onemile.dao.impl;

import com.junlanli.search.onemile.dao.TeacherESDao;
import com.junlanli.search.onemile.model.esmodel.TeacherES;
import org.springframework.stereotype.Repository;


/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Repository
public class TeacherESDaoImpl extends BaseESDaoImpl<TeacherES> implements TeacherESDao {

    @Override
    protected Class<TeacherES> getEntityClass() {
        return TeacherES.class;
    }
}
