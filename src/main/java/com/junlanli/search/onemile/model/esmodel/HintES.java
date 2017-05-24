package com.junlanli.search.onemile.model.esmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 24/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Document(indexName = "hint", type = "hint")
@Setting(settingPath = "mapping/hint.json")
public class HintES {

    @Id
    @Field(type = FieldType.String, index = FieldIndex.no)
    private String uid;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String chinese;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String pinyin;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private String jianpin;

    @Field(type = FieldType.Integer, index = FieldIndex.not_analyzed)
    private Integer score;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getJianpin() {
        return jianpin;
    }

    public void setJianpin(String jianpin) {
        this.jianpin = jianpin;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
