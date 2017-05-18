package com.junlanli.search.onemile.model.esmodel;

import org.springframework.data.elasticsearch.annotations.*;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class StudyExperienceES {

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String degree;

    @Mapping(mappingPath = "mapping/time.json")
//    @Field(type = FieldType.Date, format = DateFormat.year_month, index = FieldIndex.no)
    private String endtime;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String major;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String schoolname;

    //    @Field(type = FieldType.Date, format = DateFormat.year_month, index = FieldIndex.no)
    @Mapping(mappingPath = "mapping/time.json")
    private String starttime;

    private String description;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
