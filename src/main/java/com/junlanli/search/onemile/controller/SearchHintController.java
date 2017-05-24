package com.junlanli.search.onemile.controller;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.service.HintReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 24/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@RestController
@RequestMapping(value = "/search/hint", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SearchHintController {

    private final HintReadService hintReadService;

    @Autowired
    public SearchHintController(HintReadService hintReadService) {
        this.hintReadService = hintReadService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public JSONObject hint(@RequestParam String input) {
        return hintReadService.hintByName(input.toLowerCase());
    }
}
