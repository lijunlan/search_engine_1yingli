package com.junlanli.search.onemile.model.esmodel;

import org.springframework.data.elasticsearch.annotations.*;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class WorkExperienceES {

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String companyname;

    @Mapping(mappingPath = "mapping/time.json")
//    @Field(type = FieldType.Date, format = DateFormat.year_month, index = FieldIndex.no)
    private String endtime;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String position;

    @Mapping(mappingPath = "mapping/time.json")
//    @Field(type = FieldType.Date, format = DateFormat.year_month, index = FieldIndex.no)
    private String starttime;

    private String description;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
