package com.junlanli.search.onemile.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.junlanli.search.onemile.common.constant.Code;
import com.junlanli.search.onemile.util.FastJsonUtil;
import com.junlanli.search.onemile.util.NamePinyinUtil;
import com.junlanli.search.onemile.dao.TeacherESDao;
import com.junlanli.search.onemile.mapper.custom.TeacherCustomMapper;
import com.junlanli.search.onemile.model.Studyexperience;
import com.junlanli.search.onemile.model.Workexperience;
import com.junlanli.search.onemile.model.esmodel.StudyExperienceES;
import com.junlanli.search.onemile.model.esmodel.TeacherES;
import com.junlanli.search.onemile.model.esmodel.WorkExperienceES;
import com.junlanli.search.onemile.model.selectmodel.TeacherAll;
import com.junlanli.search.onemile.service.TeacherService;
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
 * Created on 16/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    private static final Logger logger = Logger.getLogger(TeacherServiceImpl.class);

    private final TeacherCustomMapper teacherMapper;

    private final TeacherESDao teacherESDao;

    @Autowired
    public TeacherServiceImpl(TeacherCustomMapper teacherMapper,
                              TeacherESDao teacherESDao) {
        this.teacherMapper = teacherMapper;
        this.teacherESDao = teacherESDao;
    }

    @Override
    public JSONObject createIndex() {
        try {
            Boolean r = teacherESDao.createIndex();
            if (r) {
                logger.info("create index of [" + TeacherES.class + "] successfully");
            } else {
                logger.info("create index of [" + TeacherES.class + "] failed");
            }
            return FastJsonUtil.success();
        } catch (Exception e) {
            logger.error("create index failed", e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
        }
    }

    @Override
    public JSONObject refreshOne(long teacherId) {
        try {
            TeacherAll teacherAll = teacherMapper.selectOne(teacherId);
            TeacherES teacherES = transfer(teacherAll);
            String r = teacherESDao.index(teacherES);
            return FastJsonUtil.success(r);
        } catch (Exception e) {
            logger.error("refresh an index failed", e);
            return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
        }
    }

    @Override
    public JSONObject refreshAll(int page, int size) {
        try {
            List<TeacherAll> teachers = teacherMapper.selectAll(page * size, size);
            List<TeacherES> teacherESList = new ArrayList<>(teachers.size());
            for (TeacherAll teacher : teachers) {
                teacherESList.add(transfer(teacher));
            }
            teacherESDao.bulkIndex(teacherESList);
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

    private TeacherES transfer(TeacherAll teacherAll) {
        TeacherES teacherES = new TeacherES();
        String name = teacherAll.getName();
        String pinyin = NamePinyinUtil.transferName(name);
        String jianpin = NamePinyinUtil.transferSimpleName(name);
        teacherES.setNameQuanpin(pinyin);
        teacherES.setNameJianpin(jianpin);
        teacherES.setTeacherId(teacherAll.getTeacherId());
        teacherES.setName(teacherAll.getName());
        teacherES.setEmail(teacherAll.getEmail());
        teacherES.setPhone(teacherAll.getPhone());
        teacherES.setSimpleInfo(teacherAll.getSimpleinfo());
        teacherES.setTopic(teacherAll.getTopic());
        teacherES.setIntroduce(teacherAll.getIntroduce());
        if (teacherAll.getIconurl() != null) {
            String url = teacherAll.getIconurl().replace("http://image.1yingli.cn/", "http://yiyinglipic.oss-cn-hangzhou.aliyuncs.com/");
            url = url.replaceAll("@.*", "");
            teacherES.setIconUrl(url);
        }
        List<Studyexperience> studyexperiences = teacherAll.getStudyexperiences();
        List<StudyExperienceES> studyExperienceESList = new ArrayList<>(studyexperiences.size());
        for (Studyexperience studyexperience : studyexperiences) {
            StudyExperienceES studyExperienceES = JSON.toJavaObject((JSON) JSON.toJSON(studyexperience), StudyExperienceES.class);
            studyExperienceESList.add(studyExperienceES);
        }
        List<Workexperience> workexperiences = teacherAll.getWorkexperiences();
        List<WorkExperienceES> workExperienceESList = new ArrayList<>(workexperiences.size());
        for (Workexperience workexperience : workexperiences) {
            WorkExperienceES workExperienceES = JSON.toJavaObject((JSON) JSON.toJSON(workexperience), WorkExperienceES.class);
            workExperienceESList.add(workExperienceES);
        }
        teacherES.setStudyExperiences(studyExperienceESList);
        teacherES.setWorkExperiences(workExperienceESList);
        return teacherES;
    }
}
