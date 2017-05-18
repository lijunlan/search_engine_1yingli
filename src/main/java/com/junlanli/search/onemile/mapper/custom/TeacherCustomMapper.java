package com.junlanli.search.onemile.mapper.custom;

import com.junlanli.search.onemile.mapper.TeacherMapper;
import com.junlanli.search.onemile.model.selectmodel.TeacherAll;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public interface TeacherCustomMapper extends TeacherMapper {

    @Select({
            "SELECT",
            "TEACHER_ID, ADDRESS, ALIPAY, ANSWERRATIO, ANSWERTIME, BGURL, CHECKDEGREESTATE, ",
            "CHECKEMAIL, CHECKIDCARDSTATE, CHECKPASSAGENUMBER, CHECKPHONE, CHECKWORKSTATE, ",
            "COMMENTNUMBER, CREATETIME, EMAIL, FINISHORDERNUMBER, FIRSTIDENTITY, ICONURL, ",
            "LEVEL, LIKENUMBER, LOOKNUMBER, MILE, NAME, ONSERVICE, ORDERNUMBER, PASSAGENUMBER, ",
            "PAYPAL, PHONE, PRAISERATIO, PRICE, REFUSEPASSAGENUMBER, SCORE, SERVICEPRONUMBERFORTEACHER, ",
            "SERVICEPRONUMBERFORUSER, SEX, SIMPLEINFO, TIPMARK, TOPIC, USERNAME, USER_ID, ",
            "REWARDNUMBER, ORDERALLNUMBER, ACCEPTORDERNUMBER, MASKNUMBER, MASKFINISHNUMBER, ",
            "ONCHAT, SUBMILE, SHOWNOTIFY, INTRODUCE",
            "from teacher",
            "limit #{skip,jdbcType=INTEGER},#{size,jdbcType=INTEGER}"
    })
    @Results(id = "teacherall_whole",
            value = {
                    @Result(column = "TEACHER_ID", property = "teacherId", jdbcType = JdbcType.BIGINT, id = true),
                    @Result(column = "ADDRESS", property = "address", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "ALIPAY", property = "alipay", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "ANSWERRATIO", property = "answerratio", jdbcType = JdbcType.REAL),
                    @Result(column = "ANSWERTIME", property = "answertime", jdbcType = JdbcType.BIGINT),
                    @Result(column = "BGURL", property = "bgurl", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "CHECKDEGREESTATE", property = "checkdegreestate", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "CHECKEMAIL", property = "checkemail", jdbcType = JdbcType.BIT),
                    @Result(column = "CHECKIDCARDSTATE", property = "checkidcardstate", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "CHECKPASSAGENUMBER", property = "checkpassagenumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "CHECKPHONE", property = "checkphone", jdbcType = JdbcType.BIT),
                    @Result(column = "CHECKWORKSTATE", property = "checkworkstate", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "COMMENTNUMBER", property = "commentnumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "CREATETIME", property = "createtime", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "EMAIL", property = "email", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "FINISHORDERNUMBER", property = "finishordernumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "FIRSTIDENTITY", property = "firstidentity", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "ICONURL", property = "iconurl", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "LEVEL", property = "level", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "LIKENUMBER", property = "likenumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "LOOKNUMBER", property = "looknumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "MILE", property = "mile", jdbcType = JdbcType.REAL),
                    @Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "ONSERVICE", property = "onservice", jdbcType = JdbcType.BIT),
                    @Result(column = "ORDERNUMBER", property = "ordernumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "PASSAGENUMBER", property = "passagenumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "PAYPAL", property = "paypal", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "PHONE", property = "phone", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "PRAISERATIO", property = "praiseratio", jdbcType = JdbcType.REAL),
                    @Result(column = "PRICE", property = "price", jdbcType = JdbcType.REAL),
                    @Result(column = "REFUSEPASSAGENUMBER", property = "refusepassagenumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "SCORE", property = "score", jdbcType = JdbcType.REAL),
                    @Result(column = "SERVICEPRONUMBERFORTEACHER", property = "servicepronumberforteacher", jdbcType = JdbcType.INTEGER),
                    @Result(column = "SERVICEPRONUMBERFORUSER", property = "servicepronumberforuser", jdbcType = JdbcType.INTEGER),
                    @Result(column = "SEX", property = "sex", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "SIMPLEINFO", property = "simpleinfo", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "TIPMARK", property = "tipmark", jdbcType = JdbcType.BIGINT),
                    @Result(column = "TOPIC", property = "topic", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "USERNAME", property = "username", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "USER_ID", property = "userId", jdbcType = JdbcType.BIGINT),
                    @Result(column = "REWARDNUMBER", property = "rewardnumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "ORDERALLNUMBER", property = "orderallnumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "ACCEPTORDERNUMBER", property = "acceptordernumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "MASKNUMBER", property = "masknumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "MASKFINISHNUMBER", property = "maskfinishnumber", jdbcType = JdbcType.BIGINT),
                    @Result(column = "ONCHAT", property = "onchat", jdbcType = JdbcType.BIT),
                    @Result(column = "SUBMILE", property = "submile", jdbcType = JdbcType.BIGINT),
                    @Result(column = "SHOWNOTIFY", property = "shownotify", jdbcType = JdbcType.BIT),
                    @Result(column = "INTRODUCE", property = "introduce", jdbcType = JdbcType.LONGVARCHAR),
                    @Result(column = "TEACHER_ID", property = "studyexperiences",
                            many = @Many(select = "com.junlanli.search.onemile.mapper.custom.StudyexperienceCustomMapper.selectByTeacherId")),
                    @Result(column = "TEACHER_ID", property = "workexperiences",
                            many = @Many(select = "com.junlanli.search.onemile.mapper.custom.WorkexperienceCustomMapper.selectByTeacherId"))
            })
    List<TeacherAll> selectAll(Integer skip, Integer size);

}
