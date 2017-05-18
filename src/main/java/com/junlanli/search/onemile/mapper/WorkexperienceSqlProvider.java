package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Workexperience;
import org.apache.ibatis.jdbc.SQL;

public class WorkexperienceSqlProvider {

    public String insertSelective(Workexperience record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("workexperience");
        
        if (record.getCompanyname() != null) {
            sql.VALUES("COMPANYNAME", "#{companyname,jdbcType=VARCHAR}");
        }
        
        if (record.getEndtime() != null) {
            sql.VALUES("ENDTIME", "#{endtime,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            sql.VALUES("POSITION", "#{position,jdbcType=VARCHAR}");
        }
        
        if (record.getStarttime() != null) {
            sql.VALUES("STARTTIME", "#{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherId() != null) {
            sql.VALUES("TEACHER_ID", "#{teacherId,jdbcType=BIGINT}");
        }
        
        if (record.getWorkNo() != null) {
            sql.VALUES("WORK_NO", "#{workNo,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Workexperience record) {
        SQL sql = new SQL();
        sql.UPDATE("workexperience");
        
        if (record.getCompanyname() != null) {
            sql.SET("COMPANYNAME = #{companyname,jdbcType=VARCHAR}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("ENDTIME = #{endtime,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            sql.SET("POSITION = #{position,jdbcType=VARCHAR}");
        }
        
        if (record.getStarttime() != null) {
            sql.SET("STARTTIME = #{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherId() != null) {
            sql.SET("TEACHER_ID = #{teacherId,jdbcType=BIGINT}");
        }
        
        if (record.getWorkNo() != null) {
            sql.SET("WORK_NO = #{workNo,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{description,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("WORKEXPERIENCE_ID = #{workexperienceId,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}