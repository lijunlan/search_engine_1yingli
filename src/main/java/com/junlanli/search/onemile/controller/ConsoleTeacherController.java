package com.junlanli.search.onemile.controller;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.service.TeacherWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 23/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@RestController
@RequestMapping(value = "/console/teacher", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ConsoleTeacherController {

    private final TeacherWriteService teacherWriteService;

    @Autowired
    public ConsoleTeacherController(TeacherWriteService teacherWriteService) {
        this.teacherWriteService = teacherWriteService;
    }

    @RequestMapping(value = "/createIndex", method = RequestMethod.POST)
    public JSONObject createIndex() {
        return teacherWriteService.createIndex();
    }

    @RequestMapping(value = "/indexAll", method = RequestMethod.POST)
    public JSONObject indexAll() {
        return teacherWriteService.refreshAll();
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public JSONObject index(@RequestParam Long teacherId) {
        return teacherWriteService.refreshOne(teacherId);
    }
}
