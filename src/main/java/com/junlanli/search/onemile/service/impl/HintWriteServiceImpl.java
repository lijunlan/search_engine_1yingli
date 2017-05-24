package com.junlanli.search.onemile.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.junlanli.search.onemile.common.constant.Code;
import com.junlanli.search.onemile.dao.repository.HintESRepository;
import com.junlanli.search.onemile.mapper.custom.TeacherCustomMapper;
import com.junlanli.search.onemile.model.Studyexperience;
import com.junlanli.search.onemile.model.Workexperience;
import com.junlanli.search.onemile.model.esmodel.HintES;
import com.junlanli.search.onemile.model.selectmodel.TeacherAll;
import com.junlanli.search.onemile.service.HintWriteService;
import com.junlanli.search.onemile.util.FastJsonUtil;
import com.junlanli.search.onemile.util.NamePinyinUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.ElasticsearchException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 24/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Service
public class HintWriteServiceImpl implements HintWriteService {

    private static final Logger logger = Logger.getLogger(HintWriteServiceImpl.class);

    private final TeacherCustomMapper teacherMapper;

    private final HintESRepository hintESRepository;

    @Autowired
    public HintWriteServiceImpl(TeacherCustomMapper teacherMapper,
                                HintESRepository hintESRepository) {
        this.teacherMapper = teacherMapper;
        this.hintESRepository = hintESRepository;
    }

    private static final int size = 100;

    @Override
    public JSONObject createIndex() {
        try {
            Boolean r = hintESRepository.createIndex();
            if (r) {
                logger.info("create index of [" + HintES.class + "] successfully");
            } else {
                logger.info("create index of [" + HintES.class + "] failed");
            }
            return FastJsonUtil.success();
        } catch (Exception e) {
            logger.error("create index failed", e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
        }
    }

    private HintES assembleHint(String chinese, String id, Integer score) {
        HintES nameHint = new HintES();
        nameHint.setUid(id);
        nameHint.setChinese(chinese);
        nameHint.setPinyin(NamePinyinUtil.transferName(chinese));
        nameHint.setJianpin(NamePinyinUtil.transferSimpleName(chinese));
        nameHint.setScore(score);
        return nameHint;
    }

    @Override
    public JSONObject refreshAll() {
        try {
            int page = 0;
            while (true) {
                List<TeacherAll> teachers = teacherMapper.selectAll(page * size, size);
                if (teachers.size() == 0) break;
                List<HintES> hintESList = new ArrayList<>();
                for (TeacherAll teacher : teachers) {
                    hintESList.add(assembleHint(teacher.getName(), teacher.getTeacherId() + "", 10));
                    List<Studyexperience> studyexperiences = teacher.getStudyexperiences();
                    for (Studyexperience studyexperience : studyexperiences) {
                        hintESList.add(assembleHint(
                                studyexperience.getSchoolname(),
                                "s_sn_" + teacher.getTeacherId() + "_" + studyexperience.getStudyexperienceId(),
                                9
                        ));
                        hintESList.add(assembleHint(
                                studyexperience.getMajor(),
                                "s_m_" + teacher.getTeacherId() + "_" + studyexperience.getStudyexperienceId(),
                                8
                        ));
                    }
                    List<Workexperience> workexperiences = teacher.getWorkexperiences();
                    for (Workexperience workexperience : workexperiences) {
                        hintESList.add(assembleHint(
                                workexperience.getCompanyname(),
                                "w_cn_" + teacher.getTeacherId() + "_" + workexperience.getWorkexperienceId(),
                                9
                        ));
                        hintESList.add(assembleHint(
                                workexperience.getPosition(),
                                "w_p_" + teacher.getTeacherId() + "_" + workexperience.getWorkexperienceId(),
                                8
                        ));
                    }
                }
                hintESRepository.bulkIndex(hintESList);
                page++;
            }
            return FastJsonUtil.success();
        } catch (ElasticsearchException e) {
            Map<String, String> fl = e.getFailedDocuments();
            String message = JSON.toJSONString(fl, SerializerFeature.PrettyFormat);
            logger.error(message, e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, message);
        } catch (Exception e) {
            logger.error("refresh all indices failed", e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
        }
    }
}
