package com.junlanli.search.onemile.dao.repository;

import com.junlanli.search.onemile.dao.repository.custom.BaseESDao;
import com.junlanli.search.onemile.model.esmodel.TeacherES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 22/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public interface TeacherESRepository extends BaseESDao<TeacherES, Long> {

    @Query("{\n" +
            "  \"bool\": {\n" +
            "    \"should\": [\n" +
            "      {\n" +
            "        \"term\": {\n" +
            "          \"name\": \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"term\": {\n" +
            "          \"nameQuanpin\" : \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"term\": {\n" +
            "          \"nameJianpin\" : \"?0\"\n" +
            "        }\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}")
    Page<TeacherES> findByNameOrNamePinyin(String input, Pageable pageable);

    @Query("{\n" +
            "  \"bool\": {\n" +
            "    \"should\": [\n" +
            "      {\n" +
            "        \"prefix\" : {\n" +
            "          \"name\" : \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"prefix\" : {\n" +
            "          \"nameQuanpin\" : \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"prefix\" : {\n" +
            "          \"nameJianpin\" : \"?0\"\n" +
            "        }\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}")
    Page<TeacherES> hintByNameOrNamePinyin(String input, Pageable pageable);
}
