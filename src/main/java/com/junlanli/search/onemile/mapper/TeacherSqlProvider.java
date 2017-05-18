package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Teacher;
import org.apache.ibatis.jdbc.SQL;

public class TeacherSqlProvider {

    public String insertSelective(Teacher record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("teacher");
        
        if (record.getAddress() != null) {
            sql.VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipay() != null) {
            sql.VALUES("ALIPAY", "#{alipay,jdbcType=VARCHAR}");
        }
        
        if (record.getAnswerratio() != null) {
            sql.VALUES("ANSWERRATIO", "#{answerratio,jdbcType=REAL}");
        }
        
        if (record.getAnswertime() != null) {
            sql.VALUES("ANSWERTIME", "#{answertime,jdbcType=BIGINT}");
        }
        
        if (record.getBgurl() != null) {
            sql.VALUES("BGURL", "#{bgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckdegreestate() != null) {
            sql.VALUES("CHECKDEGREESTATE", "#{checkdegreestate,jdbcType=SMALLINT}");
        }
        
        if (record.getCheckemail() != null) {
            sql.VALUES("CHECKEMAIL", "#{checkemail,jdbcType=BIT}");
        }
        
        if (record.getCheckidcardstate() != null) {
            sql.VALUES("CHECKIDCARDSTATE", "#{checkidcardstate,jdbcType=SMALLINT}");
        }
        
        if (record.getCheckpassagenumber() != null) {
            sql.VALUES("CHECKPASSAGENUMBER", "#{checkpassagenumber,jdbcType=BIGINT}");
        }
        
        if (record.getCheckphone() != null) {
            sql.VALUES("CHECKPHONE", "#{checkphone,jdbcType=BIT}");
        }
        
        if (record.getCheckworkstate() != null) {
            sql.VALUES("CHECKWORKSTATE", "#{checkworkstate,jdbcType=SMALLINT}");
        }
        
        if (record.getCommentnumber() != null) {
            sql.VALUES("COMMENTNUMBER", "#{commentnumber,jdbcType=BIGINT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("CREATETIME", "#{createtime,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getFinishordernumber() != null) {
            sql.VALUES("FINISHORDERNUMBER", "#{finishordernumber,jdbcType=BIGINT}");
        }
        
        if (record.getFirstidentity() != null) {
            sql.VALUES("FIRSTIDENTITY", "#{firstidentity,jdbcType=VARCHAR}");
        }
        
        if (record.getIconurl() != null) {
            sql.VALUES("ICONURL", "#{iconurl,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("LEVEL", "#{level,jdbcType=SMALLINT}");
        }
        
        if (record.getLikenumber() != null) {
            sql.VALUES("LIKENUMBER", "#{likenumber,jdbcType=BIGINT}");
        }
        
        if (record.getLooknumber() != null) {
            sql.VALUES("LOOKNUMBER", "#{looknumber,jdbcType=BIGINT}");
        }
        
        if (record.getMile() != null) {
            sql.VALUES("MILE", "#{mile,jdbcType=REAL}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOnservice() != null) {
            sql.VALUES("ONSERVICE", "#{onservice,jdbcType=BIT}");
        }
        
        if (record.getOrdernumber() != null) {
            sql.VALUES("ORDERNUMBER", "#{ordernumber,jdbcType=BIGINT}");
        }
        
        if (record.getPassagenumber() != null) {
            sql.VALUES("PASSAGENUMBER", "#{passagenumber,jdbcType=BIGINT}");
        }
        
        if (record.getPaypal() != null) {
            sql.VALUES("PAYPAL", "#{paypal,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("PHONE", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPraiseratio() != null) {
            sql.VALUES("PRAISERATIO", "#{praiseratio,jdbcType=REAL}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("PRICE", "#{price,jdbcType=REAL}");
        }
        
        if (record.getRefusepassagenumber() != null) {
            sql.VALUES("REFUSEPASSAGENUMBER", "#{refusepassagenumber,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("SCORE", "#{score,jdbcType=REAL}");
        }
        
        if (record.getServicepronumberforteacher() != null) {
            sql.VALUES("SERVICEPRONUMBERFORTEACHER", "#{servicepronumberforteacher,jdbcType=INTEGER}");
        }
        
        if (record.getServicepronumberforuser() != null) {
            sql.VALUES("SERVICEPRONUMBERFORUSER", "#{servicepronumberforuser,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("SEX", "#{sex,jdbcType=SMALLINT}");
        }
        
        if (record.getSimpleinfo() != null) {
            sql.VALUES("SIMPLEINFO", "#{simpleinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getTipmark() != null) {
            sql.VALUES("TIPMARK", "#{tipmark,jdbcType=BIGINT}");
        }
        
        if (record.getTopic() != null) {
            sql.VALUES("TOPIC", "#{topic,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("USERNAME", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardnumber() != null) {
            sql.VALUES("REWARDNUMBER", "#{rewardnumber,jdbcType=BIGINT}");
        }
        
        if (record.getOrderallnumber() != null) {
            sql.VALUES("ORDERALLNUMBER", "#{orderallnumber,jdbcType=BIGINT}");
        }
        
        if (record.getAcceptordernumber() != null) {
            sql.VALUES("ACCEPTORDERNUMBER", "#{acceptordernumber,jdbcType=BIGINT}");
        }
        
        if (record.getMasknumber() != null) {
            sql.VALUES("MASKNUMBER", "#{masknumber,jdbcType=BIGINT}");
        }
        
        if (record.getMaskfinishnumber() != null) {
            sql.VALUES("MASKFINISHNUMBER", "#{maskfinishnumber,jdbcType=BIGINT}");
        }
        
        if (record.getOnchat() != null) {
            sql.VALUES("ONCHAT", "#{onchat,jdbcType=BIT}");
        }
        
        if (record.getSubmile() != null) {
            sql.VALUES("SUBMILE", "#{submile,jdbcType=BIGINT}");
        }
        
        if (record.getShownotify() != null) {
            sql.VALUES("SHOWNOTIFY", "#{shownotify,jdbcType=BIT}");
        }
        
        if (record.getIntroduce() != null) {
            sql.VALUES("INTRODUCE", "#{introduce,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Teacher record) {
        SQL sql = new SQL();
        sql.UPDATE("teacher");
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipay() != null) {
            sql.SET("ALIPAY = #{alipay,jdbcType=VARCHAR}");
        }
        
        if (record.getAnswerratio() != null) {
            sql.SET("ANSWERRATIO = #{answerratio,jdbcType=REAL}");
        }
        
        if (record.getAnswertime() != null) {
            sql.SET("ANSWERTIME = #{answertime,jdbcType=BIGINT}");
        }
        
        if (record.getBgurl() != null) {
            sql.SET("BGURL = #{bgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckdegreestate() != null) {
            sql.SET("CHECKDEGREESTATE = #{checkdegreestate,jdbcType=SMALLINT}");
        }
        
        if (record.getCheckemail() != null) {
            sql.SET("CHECKEMAIL = #{checkemail,jdbcType=BIT}");
        }
        
        if (record.getCheckidcardstate() != null) {
            sql.SET("CHECKIDCARDSTATE = #{checkidcardstate,jdbcType=SMALLINT}");
        }
        
        if (record.getCheckpassagenumber() != null) {
            sql.SET("CHECKPASSAGENUMBER = #{checkpassagenumber,jdbcType=BIGINT}");
        }
        
        if (record.getCheckphone() != null) {
            sql.SET("CHECKPHONE = #{checkphone,jdbcType=BIT}");
        }
        
        if (record.getCheckworkstate() != null) {
            sql.SET("CHECKWORKSTATE = #{checkworkstate,jdbcType=SMALLINT}");
        }
        
        if (record.getCommentnumber() != null) {
            sql.SET("COMMENTNUMBER = #{commentnumber,jdbcType=BIGINT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("CREATETIME = #{createtime,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getFinishordernumber() != null) {
            sql.SET("FINISHORDERNUMBER = #{finishordernumber,jdbcType=BIGINT}");
        }
        
        if (record.getFirstidentity() != null) {
            sql.SET("FIRSTIDENTITY = #{firstidentity,jdbcType=VARCHAR}");
        }
        
        if (record.getIconurl() != null) {
            sql.SET("ICONURL = #{iconurl,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("LEVEL = #{level,jdbcType=SMALLINT}");
        }
        
        if (record.getLikenumber() != null) {
            sql.SET("LIKENUMBER = #{likenumber,jdbcType=BIGINT}");
        }
        
        if (record.getLooknumber() != null) {
            sql.SET("LOOKNUMBER = #{looknumber,jdbcType=BIGINT}");
        }
        
        if (record.getMile() != null) {
            sql.SET("MILE = #{mile,jdbcType=REAL}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOnservice() != null) {
            sql.SET("ONSERVICE = #{onservice,jdbcType=BIT}");
        }
        
        if (record.getOrdernumber() != null) {
            sql.SET("ORDERNUMBER = #{ordernumber,jdbcType=BIGINT}");
        }
        
        if (record.getPassagenumber() != null) {
            sql.SET("PASSAGENUMBER = #{passagenumber,jdbcType=BIGINT}");
        }
        
        if (record.getPaypal() != null) {
            sql.SET("PAYPAL = #{paypal,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("PHONE = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPraiseratio() != null) {
            sql.SET("PRAISERATIO = #{praiseratio,jdbcType=REAL}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("PRICE = #{price,jdbcType=REAL}");
        }
        
        if (record.getRefusepassagenumber() != null) {
            sql.SET("REFUSEPASSAGENUMBER = #{refusepassagenumber,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            sql.SET("SCORE = #{score,jdbcType=REAL}");
        }
        
        if (record.getServicepronumberforteacher() != null) {
            sql.SET("SERVICEPRONUMBERFORTEACHER = #{servicepronumberforteacher,jdbcType=INTEGER}");
        }
        
        if (record.getServicepronumberforuser() != null) {
            sql.SET("SERVICEPRONUMBERFORUSER = #{servicepronumberforuser,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.SET("SEX = #{sex,jdbcType=SMALLINT}");
        }
        
        if (record.getSimpleinfo() != null) {
            sql.SET("SIMPLEINFO = #{simpleinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getTipmark() != null) {
            sql.SET("TIPMARK = #{tipmark,jdbcType=BIGINT}");
        }
        
        if (record.getTopic() != null) {
            sql.SET("TOPIC = #{topic,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("USERNAME = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRewardnumber() != null) {
            sql.SET("REWARDNUMBER = #{rewardnumber,jdbcType=BIGINT}");
        }
        
        if (record.getOrderallnumber() != null) {
            sql.SET("ORDERALLNUMBER = #{orderallnumber,jdbcType=BIGINT}");
        }
        
        if (record.getAcceptordernumber() != null) {
            sql.SET("ACCEPTORDERNUMBER = #{acceptordernumber,jdbcType=BIGINT}");
        }
        
        if (record.getMasknumber() != null) {
            sql.SET("MASKNUMBER = #{masknumber,jdbcType=BIGINT}");
        }
        
        if (record.getMaskfinishnumber() != null) {
            sql.SET("MASKFINISHNUMBER = #{maskfinishnumber,jdbcType=BIGINT}");
        }
        
        if (record.getOnchat() != null) {
            sql.SET("ONCHAT = #{onchat,jdbcType=BIT}");
        }
        
        if (record.getSubmile() != null) {
            sql.SET("SUBMILE = #{submile,jdbcType=BIGINT}");
        }
        
        if (record.getShownotify() != null) {
            sql.SET("SHOWNOTIFY = #{shownotify,jdbcType=BIT}");
        }
        
        if (record.getIntroduce() != null) {
            sql.SET("INTRODUCE = #{introduce,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("TEACHER_ID = #{teacherId,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}