package com.junlanli.search.onemile.model.selectmodel;

import com.alibaba.fastjson.JSON;
import com.junlanli.search.onemile.model.Studyexperience;
import com.junlanli.search.onemile.model.Teacher;
import com.junlanli.search.onemile.model.Workexperience;

import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class TeacherAll extends Teacher {

    private List<Studyexperience> studyexperiences;

    private List<Workexperience> workexperiences;

    public List<Studyexperience> getStudyexperiences() {
        return studyexperiences;
    }

    public void setStudyexperiences(List<Studyexperience> studyexperiences) {
        this.studyexperiences = studyexperiences;
    }

    public List<Workexperience> getWorkexperiences() {
        return workexperiences;
    }

    public void setWorkexperiences(List<Workexperience> workexperiences) {
        this.workexperiences = workexperiences;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TeacherAll{" +
                "studyexperiences=" + JSON.toJSONString(studyexperiences) +
                ", workexperiences=" + JSON.toJSONString(workexperiences) +
                '}';
    }
}
