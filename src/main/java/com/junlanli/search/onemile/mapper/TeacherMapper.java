package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface TeacherMapper {


    @Delete({
            "delete from teacher",
            "where TEACHER_ID = #{teacherId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long teacherId);

    @Insert({
            "insert into teacher (ADDRESS, ALIPAY, ",
            "ANSWERRATIO, ANSWERTIME, ",
            "BGURL, CHECKDEGREESTATE, ",
            "CHECKEMAIL, CHECKIDCARDSTATE, ",
            "CHECKPASSAGENUMBER, CHECKPHONE, ",
            "CHECKWORKSTATE, COMMENTNUMBER, ",
            "CREATETIME, EMAIL, ",
            "FINISHORDERNUMBER, FIRSTIDENTITY, ",
            "ICONURL, LEVEL, ",
            "LIKENUMBER, LOOKNUMBER, ",
            "MILE, NAME, ONSERVICE, ",
            "ORDERNUMBER, PASSAGENUMBER, ",
            "PAYPAL, PHONE, PRAISERATIO, ",
            "PRICE, REFUSEPASSAGENUMBER, ",
            "SCORE, SERVICEPRONUMBERFORTEACHER, ",
            "SERVICEPRONUMBERFORUSER, SEX, ",
            "SIMPLEINFO, TIPMARK, ",
            "TOPIC, USERNAME, ",
            "USER_ID, REWARDNUMBER, ",
            "ORDERALLNUMBER, ACCEPTORDERNUMBER, ",
            "MASKNUMBER, MASKFINISHNUMBER, ",
            "ONCHAT, SUBMILE, SHOWNOTIFY, ",
            "INTRODUCE)",
            "values (#{address,jdbcType=VARCHAR}, #{alipay,jdbcType=VARCHAR}, ",
            "#{answerratio,jdbcType=REAL}, #{answertime,jdbcType=BIGINT}, ",
            "#{bgurl,jdbcType=VARCHAR}, #{checkdegreestate,jdbcType=SMALLINT}, ",
            "#{checkemail,jdbcType=BIT}, #{checkidcardstate,jdbcType=SMALLINT}, ",
            "#{checkpassagenumber,jdbcType=BIGINT}, #{checkphone,jdbcType=BIT}, ",
            "#{checkworkstate,jdbcType=SMALLINT}, #{commentnumber,jdbcType=BIGINT}, ",
            "#{createtime,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
            "#{finishordernumber,jdbcType=BIGINT}, #{firstidentity,jdbcType=VARCHAR}, ",
            "#{iconurl,jdbcType=VARCHAR}, #{level,jdbcType=SMALLINT}, ",
            "#{likenumber,jdbcType=BIGINT}, #{looknumber,jdbcType=BIGINT}, ",
            "#{mile,jdbcType=REAL}, #{name,jdbcType=VARCHAR}, #{onservice,jdbcType=BIT}, ",
            "#{ordernumber,jdbcType=BIGINT}, #{passagenumber,jdbcType=BIGINT}, ",
            "#{paypal,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{praiseratio,jdbcType=REAL}, ",
            "#{price,jdbcType=REAL}, #{refusepassagenumber,jdbcType=BIGINT}, ",
            "#{score,jdbcType=REAL}, #{servicepronumberforteacher,jdbcType=INTEGER}, ",
            "#{servicepronumberforuser,jdbcType=INTEGER}, #{sex,jdbcType=SMALLINT}, ",
            "#{simpleinfo,jdbcType=VARCHAR}, #{tipmark,jdbcType=BIGINT}, ",
            "#{topic,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
            "#{userId,jdbcType=BIGINT}, #{rewardnumber,jdbcType=BIGINT}, ",
            "#{orderallnumber,jdbcType=BIGINT}, #{acceptordernumber,jdbcType=BIGINT}, ",
            "#{masknumber,jdbcType=BIGINT}, #{maskfinishnumber,jdbcType=BIGINT}, ",
            "#{onchat,jdbcType=BIT}, #{submile,jdbcType=BIGINT}, #{shownotify,jdbcType=BIT}, ",
            "#{introduce,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "teacherId", before = false, resultType = Long.class)
    int insert(Teacher record);

    @InsertProvider(type = TeacherSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "teacherId", before = false, resultType = Long.class)
    int insertSelective(Teacher record);

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
            "where TEACHER_ID = #{teacherId,jdbcType=BIGINT}"
    })
    @Results(id = "teacher_whole",
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
            })
    Teacher selectByPrimaryKey(Long teacherId);

    @UpdateProvider(type = TeacherSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Teacher record);

    @Update({
            "update teacher",
            "set ADDRESS = #{address,jdbcType=VARCHAR},",
            "ALIPAY = #{alipay,jdbcType=VARCHAR},",
            "ANSWERRATIO = #{answerratio,jdbcType=REAL},",
            "ANSWERTIME = #{answertime,jdbcType=BIGINT},",
            "BGURL = #{bgurl,jdbcType=VARCHAR},",
            "CHECKDEGREESTATE = #{checkdegreestate,jdbcType=SMALLINT},",
            "CHECKEMAIL = #{checkemail,jdbcType=BIT},",
            "CHECKIDCARDSTATE = #{checkidcardstate,jdbcType=SMALLINT},",
            "CHECKPASSAGENUMBER = #{checkpassagenumber,jdbcType=BIGINT},",
            "CHECKPHONE = #{checkphone,jdbcType=BIT},",
            "CHECKWORKSTATE = #{checkworkstate,jdbcType=SMALLINT},",
            "COMMENTNUMBER = #{commentnumber,jdbcType=BIGINT},",
            "CREATETIME = #{createtime,jdbcType=VARCHAR},",
            "EMAIL = #{email,jdbcType=VARCHAR},",
            "FINISHORDERNUMBER = #{finishordernumber,jdbcType=BIGINT},",
            "FIRSTIDENTITY = #{firstidentity,jdbcType=VARCHAR},",
            "ICONURL = #{iconurl,jdbcType=VARCHAR},",
            "LEVEL = #{level,jdbcType=SMALLINT},",
            "LIKENUMBER = #{likenumber,jdbcType=BIGINT},",
            "LOOKNUMBER = #{looknumber,jdbcType=BIGINT},",
            "MILE = #{mile,jdbcType=REAL},",
            "NAME = #{name,jdbcType=VARCHAR},",
            "ONSERVICE = #{onservice,jdbcType=BIT},",
            "ORDERNUMBER = #{ordernumber,jdbcType=BIGINT},",
            "PASSAGENUMBER = #{passagenumber,jdbcType=BIGINT},",
            "PAYPAL = #{paypal,jdbcType=VARCHAR},",
            "PHONE = #{phone,jdbcType=VARCHAR},",
            "PRAISERATIO = #{praiseratio,jdbcType=REAL},",
            "PRICE = #{price,jdbcType=REAL},",
            "REFUSEPASSAGENUMBER = #{refusepassagenumber,jdbcType=BIGINT},",
            "SCORE = #{score,jdbcType=REAL},",
            "SERVICEPRONUMBERFORTEACHER = #{servicepronumberforteacher,jdbcType=INTEGER},",
            "SERVICEPRONUMBERFORUSER = #{servicepronumberforuser,jdbcType=INTEGER},",
            "SEX = #{sex,jdbcType=SMALLINT},",
            "SIMPLEINFO = #{simpleinfo,jdbcType=VARCHAR},",
            "TIPMARK = #{tipmark,jdbcType=BIGINT},",
            "TOPIC = #{topic,jdbcType=VARCHAR},",
            "USERNAME = #{username,jdbcType=VARCHAR},",
            "USER_ID = #{userId,jdbcType=BIGINT},",
            "REWARDNUMBER = #{rewardnumber,jdbcType=BIGINT},",
            "ORDERALLNUMBER = #{orderallnumber,jdbcType=BIGINT},",
            "ACCEPTORDERNUMBER = #{acceptordernumber,jdbcType=BIGINT},",
            "MASKNUMBER = #{masknumber,jdbcType=BIGINT},",
            "MASKFINISHNUMBER = #{maskfinishnumber,jdbcType=BIGINT},",
            "ONCHAT = #{onchat,jdbcType=BIT},",
            "SUBMILE = #{submile,jdbcType=BIGINT},",
            "SHOWNOTIFY = #{shownotify,jdbcType=BIT},",
            "INTRODUCE = #{introduce,jdbcType=LONGVARCHAR}",
            "where TEACHER_ID = #{teacherId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Teacher record);

    @Update({
            "update teacher",
            "set ADDRESS = #{address,jdbcType=VARCHAR},",
            "ALIPAY = #{alipay,jdbcType=VARCHAR},",
            "ANSWERRATIO = #{answerratio,jdbcType=REAL},",
            "ANSWERTIME = #{answertime,jdbcType=BIGINT},",
            "BGURL = #{bgurl,jdbcType=VARCHAR},",
            "CHECKDEGREESTATE = #{checkdegreestate,jdbcType=SMALLINT},",
            "CHECKEMAIL = #{checkemail,jdbcType=BIT},",
            "CHECKIDCARDSTATE = #{checkidcardstate,jdbcType=SMALLINT},",
            "CHECKPASSAGENUMBER = #{checkpassagenumber,jdbcType=BIGINT},",
            "CHECKPHONE = #{checkphone,jdbcType=BIT},",
            "CHECKWORKSTATE = #{checkworkstate,jdbcType=SMALLINT},",
            "COMMENTNUMBER = #{commentnumber,jdbcType=BIGINT},",
            "CREATETIME = #{createtime,jdbcType=VARCHAR},",
            "EMAIL = #{email,jdbcType=VARCHAR},",
            "FINISHORDERNUMBER = #{finishordernumber,jdbcType=BIGINT},",
            "FIRSTIDENTITY = #{firstidentity,jdbcType=VARCHAR},",
            "ICONURL = #{iconurl,jdbcType=VARCHAR},",
            "LEVEL = #{level,jdbcType=SMALLINT},",
            "LIKENUMBER = #{likenumber,jdbcType=BIGINT},",
            "LOOKNUMBER = #{looknumber,jdbcType=BIGINT},",
            "MILE = #{mile,jdbcType=REAL},",
            "NAME = #{name,jdbcType=VARCHAR},",
            "ONSERVICE = #{onservice,jdbcType=BIT},",
            "ORDERNUMBER = #{ordernumber,jdbcType=BIGINT},",
            "PASSAGENUMBER = #{passagenumber,jdbcType=BIGINT},",
            "PAYPAL = #{paypal,jdbcType=VARCHAR},",
            "PHONE = #{phone,jdbcType=VARCHAR},",
            "PRAISERATIO = #{praiseratio,jdbcType=REAL},",
            "PRICE = #{price,jdbcType=REAL},",
            "REFUSEPASSAGENUMBER = #{refusepassagenumber,jdbcType=BIGINT},",
            "SCORE = #{score,jdbcType=REAL},",
            "SERVICEPRONUMBERFORTEACHER = #{servicepronumberforteacher,jdbcType=INTEGER},",
            "SERVICEPRONUMBERFORUSER = #{servicepronumberforuser,jdbcType=INTEGER},",
            "SEX = #{sex,jdbcType=SMALLINT},",
            "SIMPLEINFO = #{simpleinfo,jdbcType=VARCHAR},",
            "TIPMARK = #{tipmark,jdbcType=BIGINT},",
            "TOPIC = #{topic,jdbcType=VARCHAR},",
            "USERNAME = #{username,jdbcType=VARCHAR},",
            "USER_ID = #{userId,jdbcType=BIGINT},",
            "REWARDNUMBER = #{rewardnumber,jdbcType=BIGINT},",
            "ORDERALLNUMBER = #{orderallnumber,jdbcType=BIGINT},",
            "ACCEPTORDERNUMBER = #{acceptordernumber,jdbcType=BIGINT},",
            "MASKNUMBER = #{masknumber,jdbcType=BIGINT},",
            "MASKFINISHNUMBER = #{maskfinishnumber,jdbcType=BIGINT},",
            "ONCHAT = #{onchat,jdbcType=BIT},",
            "SUBMILE = #{submile,jdbcType=BIGINT},",
            "SHOWNOTIFY = #{shownotify,jdbcType=BIT}",
            "where TEACHER_ID = #{teacherId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Teacher record);
}