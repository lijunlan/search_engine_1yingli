package com.junlanli.search.onemile.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.junlanli.search.onemile.dao.TeacherESDao;
import com.junlanli.search.onemile.mapper.custom.TeacherCustomMapper;
import com.junlanli.search.onemile.model.Studyexperience;
import com.junlanli.search.onemile.model.Workexperience;
import com.junlanli.search.onemile.model.esmodel.StudyExperienceES;
import com.junlanli.search.onemile.model.esmodel.TeacherES;
import com.junlanli.search.onemile.model.esmodel.WorkExperienceES;
import com.junlanli.search.onemile.model.selectmodel.TeacherAll;
import com.junlanli.search.onemile.service.TeacherService;
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
        Boolean r = teacherESDao.createIndex();
        if (r) {
            System.out.println("create index of [" + TeacherES.class + "] successfully");
        } else {
            System.out.println("create index of [" + TeacherES.class + "] failed");
        }
        return null;
    }

    @Override
    public JSONObject list(int page, int size) {
        List<TeacherAll> teachers = teacherMapper.selectAll(page * size, size);
        List<TeacherES> teacherESList = new ArrayList<>(teachers.size());
        for (TeacherAll teacher : teachers) {
            TeacherES teacherES = new TeacherES();
            teacherES.setTeacherId(teacher.getTeacherId());
            teacherES.setName(teacher.getName());
            teacherES.setEmail(teacher.getEmail());
            teacherES.setPhone(teacher.getPhone());
            teacherES.setSimpleInfo(teacher.getSimpleinfo());
            teacherES.setTopic(teacher.getTopic());
            teacherES.setIntroduce(teacher.getIntroduce());
            if (teacher.getIconurl() != null) {
                String url = teacher.getIconurl().replace("http://image.1yingli.cn/", "http://yiyinglipic.oss-cn-hangzhou.aliyuncs.com/");
                url = url.replaceAll("@.*", "");
                teacherES.setIconUrl(url);
            }
            List<Studyexperience> studyexperiences = teacher.getStudyexperiences();
            List<StudyExperienceES> studyExperienceESList = new ArrayList<>(studyexperiences.size());
            for (Studyexperience studyexperience : studyexperiences) {
                StudyExperienceES studyExperienceES = JSON.toJavaObject((JSON) JSON.toJSON(studyexperience), StudyExperienceES.class);
                studyExperienceESList.add(studyExperienceES);
            }
            List<Workexperience> workexperiences = teacher.getWorkexperiences();
            List<WorkExperienceES> workExperienceESList = new ArrayList<>(workexperiences.size());
            for (Workexperience workexperience : workexperiences) {
                WorkExperienceES workExperienceES = JSON.toJavaObject((JSON) JSON.toJSON(workexperience), WorkExperienceES.class);
                workExperienceESList.add(workExperienceES);
            }
            teacherES.setStudyExperiences(studyExperienceESList);
            teacherES.setWorkExperiences(workExperienceESList);
            teacherESList.add(teacherES);
        }
        try {
            teacherESDao.bulkIndex(teacherESList);
        } catch (ElasticsearchException e) {
            Map<String, String> fl = e.getFailedDocuments();
            System.out.println(JSON.toJSONString(fl, SerializerFeature.PrettyFormat));
        }
        return null;
    }
}
