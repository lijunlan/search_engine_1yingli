package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Servicepro;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ServiceproMapper {
    @Delete({
        "delete from servicepro",
        "where SERVICEPRO_ID = #{serviceproId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long serviceproId);

    @Insert({
        "insert into servicepro (ACCEPTNO, ANSWERRATIO, ",
        "ANSWERTIME, CREATETIME, ",
        "FINISHNO, FREETIME, ",
        "IMAGEURLS, KIND, ",
        "LIKENO, NUMBER, NUMERAL, ",
        "ONSALE, ONSHOW, PRAISERATIO, ",
        "PRICE, PRICETEMP, QUANTIFIER, ",
        "REMOVE, SCORE, STATE, ",
        "SUMMARY, TIPS, TITLE, ",
        "UPDATETIME, TEACHER_ID, ",
        "COMMENTNO, ADDRESS, ",
        "TALKWAY, ORDERALLNO, ",
        "LOOKNUMBER, NOTIFY, MASKNO, ",
        "MASKFINISHNO, CONTENT)",
        "values (#{acceptno,jdbcType=BIGINT}, #{answerratio,jdbcType=REAL}, ",
        "#{answertime,jdbcType=BIGINT}, #{createtime,jdbcType=VARCHAR}, ",
        "#{finishno,jdbcType=BIGINT}, #{freetime,jdbcType=VARCHAR}, ",
        "#{imageurls,jdbcType=VARCHAR}, #{kind,jdbcType=INTEGER}, ",
        "#{likeno,jdbcType=BIGINT}, #{number,jdbcType=INTEGER}, #{numeral,jdbcType=REAL}, ",
        "#{onsale,jdbcType=BIT}, #{onshow,jdbcType=BIT}, #{praiseratio,jdbcType=REAL}, ",
        "#{price,jdbcType=REAL}, #{pricetemp,jdbcType=REAL}, #{quantifier,jdbcType=VARCHAR}, ",
        "#{remove,jdbcType=BIT}, #{score,jdbcType=REAL}, #{state,jdbcType=SMALLINT}, ",
        "#{summary,jdbcType=VARCHAR}, #{tips,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{updatetime,jdbcType=VARCHAR}, #{teacherId,jdbcType=BIGINT}, ",
        "#{commentno,jdbcType=BIGINT}, #{address,jdbcType=VARCHAR}, ",
        "#{talkway,jdbcType=SMALLINT}, #{orderallno,jdbcType=BIGINT}, ",
        "#{looknumber,jdbcType=BIGINT}, #{notify,jdbcType=BIT}, #{maskno,jdbcType=BIGINT}, ",
        "#{maskfinishno,jdbcType=BIGINT}, #{content,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="serviceproId", before=false, resultType=Long.class)
    int insert(Servicepro record);

    @InsertProvider(type=ServiceproSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="serviceproId", before=false, resultType=Long.class)
    int insertSelective(Servicepro record);

    @Select({
        "select",
        "SERVICEPRO_ID, ACCEPTNO, ANSWERRATIO, ANSWERTIME, CREATETIME, FINISHNO, FREETIME, ",
        "IMAGEURLS, KIND, LIKENO, NUMBER, NUMERAL, ONSALE, ONSHOW, PRAISERATIO, PRICE, ",
        "PRICETEMP, QUANTIFIER, REMOVE, SCORE, STATE, SUMMARY, TIPS, TITLE, UPDATETIME, ",
        "TEACHER_ID, COMMENTNO, ADDRESS, TALKWAY, ORDERALLNO, LOOKNUMBER, NOTIFY, MASKNO, ",
        "MASKFINISHNO, CONTENT",
        "from servicepro",
        "where SERVICEPRO_ID = #{serviceproId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="SERVICEPRO_ID", property="serviceproId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ACCEPTNO", property="acceptno", jdbcType=JdbcType.BIGINT),
        @Result(column="ANSWERRATIO", property="answerratio", jdbcType=JdbcType.REAL),
        @Result(column="ANSWERTIME", property="answertime", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="FINISHNO", property="finishno", jdbcType=JdbcType.BIGINT),
        @Result(column="FREETIME", property="freetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGEURLS", property="imageurls", jdbcType=JdbcType.VARCHAR),
        @Result(column="KIND", property="kind", jdbcType=JdbcType.INTEGER),
        @Result(column="LIKENO", property="likeno", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERAL", property="numeral", jdbcType=JdbcType.REAL),
        @Result(column="ONSALE", property="onsale", jdbcType=JdbcType.BIT),
        @Result(column="ONSHOW", property="onshow", jdbcType=JdbcType.BIT),
        @Result(column="PRAISERATIO", property="praiseratio", jdbcType=JdbcType.REAL),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.REAL),
        @Result(column="PRICETEMP", property="pricetemp", jdbcType=JdbcType.REAL),
        @Result(column="QUANTIFIER", property="quantifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMOVE", property="remove", jdbcType=JdbcType.BIT),
        @Result(column="SCORE", property="score", jdbcType=JdbcType.REAL),
        @Result(column="STATE", property="state", jdbcType=JdbcType.SMALLINT),
        @Result(column="SUMMARY", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIPS", property="tips", jdbcType=JdbcType.VARCHAR),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATETIME", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEACHER_ID", property="teacherId", jdbcType=JdbcType.BIGINT),
        @Result(column="COMMENTNO", property="commentno", jdbcType=JdbcType.BIGINT),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="TALKWAY", property="talkway", jdbcType=JdbcType.SMALLINT),
        @Result(column="ORDERALLNO", property="orderallno", jdbcType=JdbcType.BIGINT),
        @Result(column="LOOKNUMBER", property="looknumber", jdbcType=JdbcType.BIGINT),
        @Result(column="NOTIFY", property="notify", jdbcType=JdbcType.BIT),
        @Result(column="MASKNO", property="maskno", jdbcType=JdbcType.BIGINT),
        @Result(column="MASKFINISHNO", property="maskfinishno", jdbcType=JdbcType.BIGINT),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    Servicepro selectByPrimaryKey(Long serviceproId);

    @UpdateProvider(type=ServiceproSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Servicepro record);

    @Update({
        "update servicepro",
        "set ACCEPTNO = #{acceptno,jdbcType=BIGINT},",
          "ANSWERRATIO = #{answerratio,jdbcType=REAL},",
          "ANSWERTIME = #{answertime,jdbcType=BIGINT},",
          "CREATETIME = #{createtime,jdbcType=VARCHAR},",
          "FINISHNO = #{finishno,jdbcType=BIGINT},",
          "FREETIME = #{freetime,jdbcType=VARCHAR},",
          "IMAGEURLS = #{imageurls,jdbcType=VARCHAR},",
          "KIND = #{kind,jdbcType=INTEGER},",
          "LIKENO = #{likeno,jdbcType=BIGINT},",
          "NUMBER = #{number,jdbcType=INTEGER},",
          "NUMERAL = #{numeral,jdbcType=REAL},",
          "ONSALE = #{onsale,jdbcType=BIT},",
          "ONSHOW = #{onshow,jdbcType=BIT},",
          "PRAISERATIO = #{praiseratio,jdbcType=REAL},",
          "PRICE = #{price,jdbcType=REAL},",
          "PRICETEMP = #{pricetemp,jdbcType=REAL},",
          "QUANTIFIER = #{quantifier,jdbcType=VARCHAR},",
          "REMOVE = #{remove,jdbcType=BIT},",
          "SCORE = #{score,jdbcType=REAL},",
          "STATE = #{state,jdbcType=SMALLINT},",
          "SUMMARY = #{summary,jdbcType=VARCHAR},",
          "TIPS = #{tips,jdbcType=VARCHAR},",
          "TITLE = #{title,jdbcType=VARCHAR},",
          "UPDATETIME = #{updatetime,jdbcType=VARCHAR},",
          "TEACHER_ID = #{teacherId,jdbcType=BIGINT},",
          "COMMENTNO = #{commentno,jdbcType=BIGINT},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "TALKWAY = #{talkway,jdbcType=SMALLINT},",
          "ORDERALLNO = #{orderallno,jdbcType=BIGINT},",
          "LOOKNUMBER = #{looknumber,jdbcType=BIGINT},",
          "NOTIFY = #{notify,jdbcType=BIT},",
          "MASKNO = #{maskno,jdbcType=BIGINT},",
          "MASKFINISHNO = #{maskfinishno,jdbcType=BIGINT},",
          "CONTENT = #{content,jdbcType=LONGVARCHAR}",
        "where SERVICEPRO_ID = #{serviceproId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Servicepro record);

    @Update({
        "update servicepro",
        "set ACCEPTNO = #{acceptno,jdbcType=BIGINT},",
          "ANSWERRATIO = #{answerratio,jdbcType=REAL},",
          "ANSWERTIME = #{answertime,jdbcType=BIGINT},",
          "CREATETIME = #{createtime,jdbcType=VARCHAR},",
          "FINISHNO = #{finishno,jdbcType=BIGINT},",
          "FREETIME = #{freetime,jdbcType=VARCHAR},",
          "IMAGEURLS = #{imageurls,jdbcType=VARCHAR},",
          "KIND = #{kind,jdbcType=INTEGER},",
          "LIKENO = #{likeno,jdbcType=BIGINT},",
          "NUMBER = #{number,jdbcType=INTEGER},",
          "NUMERAL = #{numeral,jdbcType=REAL},",
          "ONSALE = #{onsale,jdbcType=BIT},",
          "ONSHOW = #{onshow,jdbcType=BIT},",
          "PRAISERATIO = #{praiseratio,jdbcType=REAL},",
          "PRICE = #{price,jdbcType=REAL},",
          "PRICETEMP = #{pricetemp,jdbcType=REAL},",
          "QUANTIFIER = #{quantifier,jdbcType=VARCHAR},",
          "REMOVE = #{remove,jdbcType=BIT},",
          "SCORE = #{score,jdbcType=REAL},",
          "STATE = #{state,jdbcType=SMALLINT},",
          "SUMMARY = #{summary,jdbcType=VARCHAR},",
          "TIPS = #{tips,jdbcType=VARCHAR},",
          "TITLE = #{title,jdbcType=VARCHAR},",
          "UPDATETIME = #{updatetime,jdbcType=VARCHAR},",
          "TEACHER_ID = #{teacherId,jdbcType=BIGINT},",
          "COMMENTNO = #{commentno,jdbcType=BIGINT},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "TALKWAY = #{talkway,jdbcType=SMALLINT},",
          "ORDERALLNO = #{orderallno,jdbcType=BIGINT},",
          "LOOKNUMBER = #{looknumber,jdbcType=BIGINT},",
          "NOTIFY = #{notify,jdbcType=BIT},",
          "MASKNO = #{maskno,jdbcType=BIGINT},",
          "MASKFINISHNO = #{maskfinishno,jdbcType=BIGINT}",
        "where SERVICEPRO_ID = #{serviceproId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Servicepro record);
}