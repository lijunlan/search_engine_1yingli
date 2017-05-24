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
            "        \"nested\": {\n" +
            "          \"path\": \"workExperiences\",\n" +
            "          \"score_mode\": \"max\",\n" +
            "          \"query\": {\n" +
            "            \"bool\": {\n" +
            "              \"should\": [\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"workExperiences.companyname\": \"?0\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"workExperiences.companynameQuanpin\": \"?0\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"workExperiences.companynameJianpin\": \"?0\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"workExperiences.position\": \"?0\"\n" +
            "                  }\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"nested\": {\n" +
            "          \"path\": \"studyExperiences\",\n" +
            "          \"score_mode\": \"max\",\n" +
            "          \"query\": {\n" +
            "            \"bool\": {\n" +
            "              \"should\": [\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"studyExperiences.schoolname\": \"?0\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"studyExperiences.schoolnameQuanpin\": \"?0\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"studyExperiences.schoolnameJianpin\": \"?0\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"term\": {\n" +
            "                    \"studyExperiences.major\": \"?0\"\n" +
            "                  }\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"term\": {\n" +
            "          \"nameQuanpin\": \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"term\": {\n" +
            "          \"name\": \"?0\"\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"term\": {\n" +
            "          \"nameJianpin\": \"?0\"\n" +
            "        }\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}")
    Page<TeacherES> findByNameOrNamePinyinOrSchoolNameOrCompanyName(String input, Pageable pageable);

}
