package com.junlanli.search.onemile.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.common.constant.Code;
import com.junlanli.search.onemile.dao.repository.TeacherESRepository;
import com.junlanli.search.onemile.model.esmodel.TeacherES;
import com.junlanli.search.onemile.model.outmodel.TeacherNameHint;
import com.junlanli.search.onemile.service.TeacherReadService;
import com.junlanli.search.onemile.util.FastJsonUtil;
import com.junlanli.search.onemile.util.ModelTransformUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 22/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Service
public class TeacherReadServiceImpl implements TeacherReadService {

    private static final Logger logger = Logger.getLogger(TeacherReadServiceImpl.class);

    private final TeacherESRepository teacherESRepository;

    @Autowired
    public TeacherReadServiceImpl(TeacherESRepository teacherESRepository) {
        this.teacherESRepository = teacherESRepository;
    }

    @Override
    public JSONObject searchByName(String name, int page, int pageSize) {
        try {
            PageRequest pageRequest = new PageRequest(page, pageSize);
            Page<TeacherES> r = teacherESRepository.findByNameOrNamePinyinOrSchoolNameOrCompanyName(name, pageRequest);
            JSONObject data = new JSONObject();
            data.put("total", r.getTotalElements());
            data.put("pageCount", r.getTotalPages());
            data.put("list", r.getContent());
            return FastJsonUtil.success(data);
        } catch (Exception e) {
            logger.error("failed to search by name", e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
        }
    }

}
