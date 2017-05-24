package com.junlanli.search.onemile.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.common.constant.Code;
import com.junlanli.search.onemile.dao.repository.HintESRepository;
import com.junlanli.search.onemile.model.esmodel.HintES;
import com.junlanli.search.onemile.service.HintReadService;
import com.junlanli.search.onemile.util.FastJsonUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 24/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Service
public class HintReadServiceImpl implements HintReadService {

    private static final Logger logger = Logger.getLogger(TeacherReadServiceImpl.class);

    private final HintESRepository hintESRepository;

    @Autowired
    public HintReadServiceImpl(HintESRepository hintESRepository) {
        this.hintESRepository = hintESRepository;
    }

    @Override
    public JSONObject hintByName(String name) {
        try {
            Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "score"));
            PageRequest pageRequest = new PageRequest(0, 8, sort);
            NativeSearchQueryBuilder searchQueryBuilder = new NativeSearchQueryBuilder();
//            searchQueryBuilder.withFields()
            Page<HintES> hintES = hintESRepository.hintByChineseOrPinyin(name, pageRequest);
            return FastJsonUtil.success(hintES.getContent());
        } catch (Exception e) {
            logger.error("failed to hint by name", e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
        }
    }
}
