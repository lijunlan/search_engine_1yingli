package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Workexperience;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface WorkexperienceMapper {

    @Delete({
        "delete from workexperience",
        "where WORKEXPERIENCE_ID = #{workexperienceId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long workexperienceId);

    @Insert({
        "insert into workexperience (COMPANYNAME, ENDTIME, ",
        "POSITION, STARTTIME, ",
        "TEACHER_ID, WORK_NO, ",
        "DESCRIPTION)",
        "values (#{companyname,jdbcType=VARCHAR}, #{endtime,jdbcType=VARCHAR}, ",
        "#{position,jdbcType=VARCHAR}, #{starttime,jdbcType=VARCHAR}, ",
        "#{teacherId,jdbcType=BIGINT}, #{workNo,jdbcType=INTEGER}, ",
        "#{description,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="workexperienceId", before=false, resultType=Long.class)
    int insert(Workexperience record);

    @InsertProvider(type=WorkexperienceSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="workexperienceId", before=false, resultType=Long.class)
    int insertSelective(Workexperience record);

    @Select({
        "select",
        "WORKEXPERIENCE_ID, COMPANYNAME, ENDTIME, POSITION, STARTTIME, TEACHER_ID, WORK_NO, ",
        "DESCRIPTION",
        "from workexperience",
        "where WORKEXPERIENCE_ID = #{workexperienceId,jdbcType=BIGINT}"
    })
    @Results(id = "workexperience_whole",
            value = {
        @Result(column="WORKEXPERIENCE_ID", property="workexperienceId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="COMPANYNAME", property="companyname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENDTIME", property="endtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="POSITION", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="STARTTIME", property="starttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEACHER_ID", property="teacherId", jdbcType=JdbcType.BIGINT),
        @Result(column="WORK_NO", property="workNo", jdbcType=JdbcType.INTEGER),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    Workexperience selectByPrimaryKey(Long workexperienceId);

    @UpdateProvider(type=WorkexperienceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Workexperience record);

    @Update({
        "update workexperience",
        "set COMPANYNAME = #{companyname,jdbcType=VARCHAR},",
          "ENDTIME = #{endtime,jdbcType=VARCHAR},",
          "POSITION = #{position,jdbcType=VARCHAR},",
          "STARTTIME = #{starttime,jdbcType=VARCHAR},",
          "TEACHER_ID = #{teacherId,jdbcType=BIGINT},",
          "WORK_NO = #{workNo,jdbcType=INTEGER},",
          "DESCRIPTION = #{description,jdbcType=LONGVARCHAR}",
        "where WORKEXPERIENCE_ID = #{workexperienceId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Workexperience record);

    @Update({
        "update workexperience",
        "set COMPANYNAME = #{companyname,jdbcType=VARCHAR},",
          "ENDTIME = #{endtime,jdbcType=VARCHAR},",
          "POSITION = #{position,jdbcType=VARCHAR},",
          "STARTTIME = #{starttime,jdbcType=VARCHAR},",
          "TEACHER_ID = #{teacherId,jdbcType=BIGINT},",
          "WORK_NO = #{workNo,jdbcType=INTEGER}",
        "where WORKEXPERIENCE_ID = #{workexperienceId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Workexperience record);
}