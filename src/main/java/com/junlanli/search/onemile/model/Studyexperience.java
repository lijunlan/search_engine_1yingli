package com.junlanli.search.onemile.model;

public class Studyexperience {
    private Long studyexperienceId;

    private String degree;

    private String endtime;

    private String major;

    private String schoolname;

    private String starttime;

    private Long teacherId;

    private Integer studyNo;

    private String description;

    public Long getStudyexperienceId() {
        return studyexperienceId;
    }

    public void setStudyexperienceId(Long studyexperienceId) {
        this.studyexperienceId = studyexperienceId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudyNo() {
        return studyNo;
    }

    public void setStudyNo(Integer studyNo) {
        this.studyNo = studyNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}