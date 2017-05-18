package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Studyexperience;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface StudyexperienceMapper {

    @Delete({
            "delete from studyexperience",
            "where STUDYEXPERIENCE_ID = #{studyexperienceId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long studyexperienceId);

    @Insert({
            "insert into studyexperience (DEGREE, ENDTIME, ",
            "MAJOR, SCHOOLNAME, ",
            "STARTTIME, TEACHER_ID, ",
            "STUDY_NO, DESCRIPTION)",
            "values (#{degree,jdbcType=VARCHAR}, #{endtime,jdbcType=VARCHAR}, ",
            "#{major,jdbcType=VARCHAR}, #{schoolname,jdbcType=VARCHAR}, ",
            "#{starttime,jdbcType=VARCHAR}, #{teacherId,jdbcType=BIGINT}, ",
            "#{studyNo,jdbcType=INTEGER}, #{description,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "studyexperienceId", before = false, resultType = Long.class)
    int insert(Studyexperience record);

    @InsertProvider(type = StudyexperienceSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "studyexperienceId", before = false, resultType = Long.class)
    int insertSelective(Studyexperience record);

    @Select({
            "SELECT",
            "STUDYEXPERIENCE_ID, DEGREE, ENDTIME, MAJOR, SCHOOLNAME, STARTTIME, TEACHER_ID, ",
            "STUDY_NO, DESCRIPTION",
            "from studyexperience",
            "where STUDYEXPERIENCE_ID = #{studyexperienceId,jdbcType=BIGINT}"
    })
    @Results(id = "studyexperience_whole",
            value = {
                    @Result(column = "STUDYEXPERIENCE_ID", property = "studyexperienceId", jdbcType = JdbcType.BIGINT, id = true),
                    @Result(column = "DEGREE", property = "degree", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "ENDTIME", property = "endtime", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "MAJOR", property = "major", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "SCHOOLNAME", property = "schoolname", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "STARTTIME", property = "starttime", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "TEACHER_ID", property = "teacherId", jdbcType = JdbcType.BIGINT),
                    @Result(column = "STUDY_NO", property = "studyNo", jdbcType = JdbcType.INTEGER),
                    @Result(column = "DESCRIPTION", property = "description", jdbcType = JdbcType.LONGVARCHAR)
            })
    Studyexperience selectByPrimaryKey(Long studyexperienceId);

    @UpdateProvider(type = StudyexperienceSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Studyexperience record);

    @Update({
            "update studyexperience",
            "set DEGREE = #{degree,jdbcType=VARCHAR},",
            "ENDTIME = #{endtime,jdbcType=VARCHAR},",
            "MAJOR = #{major,jdbcType=VARCHAR},",
            "SCHOOLNAME = #{schoolname,jdbcType=VARCHAR},",
            "STARTTIME = #{starttime,jdbcType=VARCHAR},",
            "TEACHER_ID = #{teacherId,jdbcType=BIGINT},",
            "STUDY_NO = #{studyNo,jdbcType=INTEGER},",
            "DESCRIPTION = #{description,jdbcType=LONGVARCHAR}",
            "where STUDYEXPERIENCE_ID = #{studyexperienceId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Studyexperience record);

    @Update({
            "update studyexperience",
            "set DEGREE = #{degree,jdbcType=VARCHAR},",
            "ENDTIME = #{endtime,jdbcType=VARCHAR},",
            "MAJOR = #{major,jdbcType=VARCHAR},",
            "SCHOOLNAME = #{schoolname,jdbcType=VARCHAR},",
            "STARTTIME = #{starttime,jdbcType=VARCHAR},",
            "TEACHER_ID = #{teacherId,jdbcType=BIGINT},",
            "STUDY_NO = #{studyNo,jdbcType=INTEGER}",
            "where STUDYEXPERIENCE_ID = #{studyexperienceId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Studyexperience record);
}