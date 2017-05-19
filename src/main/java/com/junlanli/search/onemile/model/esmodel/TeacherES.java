package com.junlanli.search.onemile.model.esmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
//@Mapping(mappingPath = )
@Document(indexName = "teacher", type = "test")
@Setting(settingPath = "mapping/teacher.json")
public class TeacherES {

    @Id
    @Field(type = FieldType.Long, index = FieldIndex.no)
    private Long teacherId;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String name;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String nameQuanpin;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String nameJianpin;

    @Field(type = FieldType.String, index = FieldIndex.no)
    private String email;

    @Field(type = FieldType.String, index = FieldIndex.no)
    private String phone;

    @Field(type = FieldType.String, analyzer = "ik_smart", searchAnalyzer = "ik_smart")
    private String simpleInfo;

    @Field(type = FieldType.String, analyzer = "ik_smart", searchAnalyzer = "ik_smart")
    private String topic;

    @Field(type = FieldType.String, analyzer = "html_ik_smart", searchAnalyzer = "html_ik_smart")
    private String introduce;

    @Field(type = FieldType.String, index = FieldIndex.no)
    private String iconUrl;

    @Field(type = FieldType.Nested)
    private List<StudyExperienceES> studyExperiences;

    @Field(type = FieldType.Nested)
    private List<WorkExperienceES> workExperiences;

    public String getNameQuanpin() {
        return nameQuanpin;
    }

    public void setNameQuanpin(String nameQuanpin) {
        this.nameQuanpin = nameQuanpin;
    }

    public String getNameJianpin() {
        return nameJianpin;
    }

    public void setNameJianpin(String nameJianpin) {
        this.nameJianpin = nameJianpin;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSimpleInfo() {
        return simpleInfo;
    }

    public void setSimpleInfo(String simpleInfo) {
        this.simpleInfo = simpleInfo;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<StudyExperienceES> getStudyExperiences() {
        return studyExperiences;
    }

    public void setStudyExperiences(List<StudyExperienceES> studyExperiences) {
        this.studyExperiences = studyExperiences;
    }

    public List<WorkExperienceES> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperienceES> workExperiences) {
        this.workExperiences = workExperiences;
    }
}
