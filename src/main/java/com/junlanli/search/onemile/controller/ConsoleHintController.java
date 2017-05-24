package com.junlanli.search.onemile.controller;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.service.HintWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 24/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@RestController
@RequestMapping(value = "/console/hint", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ConsoleHintController {

    private final HintWriteService hintWriteService;

    @Autowired
    public ConsoleHintController(HintWriteService hintWriteService) {
        this.hintWriteService = hintWriteService;
    }

    @RequestMapping(value = "/createIndex", method = RequestMethod.POST)
    public JSONObject createIndex() {
        return hintWriteService.createIndex();
    }

    @RequestMapping(value = "/indexAll", method = RequestMethod.POST)
    public JSONObject indexAll() {
        return hintWriteService.refreshAll();
    }

}
