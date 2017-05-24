package com.junlanli.search.onemile.controller;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.service.TeacherReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 22/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@RestController
@RequestMapping(value = "/search/teacher", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SearchTeacherController {

    private final TeacherReadService teacherReadService;

    @Autowired
    public SearchTeacherController(TeacherReadService teacherReadService) {
        this.teacherReadService = teacherReadService;
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public JSONObject searchName(@RequestParam String input,
                                 @RequestParam Integer page,
                                 @RequestParam Integer pageSize) {
        return teacherReadService.searchByName(input, page, pageSize);
    }
}
