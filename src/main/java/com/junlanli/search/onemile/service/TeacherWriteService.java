package com.junlanli.search.onemile.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 16/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public interface TeacherWriteService {

    JSONObject refreshAll();

    JSONObject createIndex();

    JSONObject refreshOne(long teacherId);
}
