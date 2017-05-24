package com.junlanli.search.onemile.dao.repository;

import com.junlanli.search.onemile.dao.repository.custom.BaseESDao;
import com.junlanli.search.onemile.model.esmodel.HintES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 24/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public interface HintESRepository extends BaseESDao<HintES, String> {

    @Query("{\n" +
            "  \"bool\": {\n" +
            "    \"should\": [\n" +
            "      {\n" +
            "        \"prefix\" : {\n" +
            "          \"chinese\" : \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"prefix\" : {\n" +
            "          \"pinyin\" : \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"prefix\" : {\n" +
            "          \"jianpin\" : \"?0\"\n" +
            "        }\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}")
    Page<HintES> hintByChineseOrPinyin(String input, Pageable pageable);
}
