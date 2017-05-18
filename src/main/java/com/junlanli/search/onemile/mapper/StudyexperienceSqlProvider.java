package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Studyexperience;
import org.apache.ibatis.jdbc.SQL;

public class StudyexperienceSqlProvider {

    public String insertSelective(Studyexperience record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("studyexperience");
        
        if (record.getDegree() != null) {
            sql.VALUES("DEGREE", "#{degree,jdbcType=VARCHAR}");
        }
        
        if (record.getEndtime() != null) {
            sql.VALUES("ENDTIME", "#{endtime,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            sql.VALUES("MAJOR", "#{major,jdbcType=VARCHAR}");
        }
        
        if (record.getSchoolname() != null) {
            sql.VALUES("SCHOOLNAME", "#{schoolname,jdbcType=VARCHAR}");
        }
        
        if (record.getStarttime() != null) {
            sql.VALUES("STARTTIME", "#{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherId() != null) {
            sql.VALUES("TEACHER_ID", "#{teacherId,jdbcType=BIGINT}");
        }
        
        if (record.getStudyNo() != null) {
            sql.VALUES("STUDY_NO", "#{studyNo,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Studyexperience record) {
        SQL sql = new SQL();
        sql.UPDATE("studyexperience");
        
        if (record.getDegree() != null) {
            sql.SET("DEGREE = #{degree,jdbcType=VARCHAR}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("ENDTIME = #{endtime,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            sql.SET("MAJOR = #{major,jdbcType=VARCHAR}");
        }
        
        if (record.getSchoolname() != null) {
            sql.SET("SCHOOLNAME = #{schoolname,jdbcType=VARCHAR}");
        }
        
        if (record.getStarttime() != null) {
            sql.SET("STARTTIME = #{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherId() != null) {
            sql.SET("TEACHER_ID = #{teacherId,jdbcType=BIGINT}");
        }
        
        if (record.getStudyNo() != null) {
            sql.SET("STUDY_NO = #{studyNo,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{description,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("STUDYEXPERIENCE_ID = #{studyexperienceId,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}