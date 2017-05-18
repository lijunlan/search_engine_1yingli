package com.junlanli.search.onemile.mapper;

import com.junlanli.search.onemile.model.Servicepro;
import org.apache.ibatis.jdbc.SQL;

public class ServiceproSqlProvider {

    public String insertSelective(Servicepro record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("servicepro");
        
        if (record.getAcceptno() != null) {
            sql.VALUES("ACCEPTNO", "#{acceptno,jdbcType=BIGINT}");
        }
        
        if (record.getAnswerratio() != null) {
            sql.VALUES("ANSWERRATIO", "#{answerratio,jdbcType=REAL}");
        }
        
        if (record.getAnswertime() != null) {
            sql.VALUES("ANSWERTIME", "#{answertime,jdbcType=BIGINT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("CREATETIME", "#{createtime,jdbcType=VARCHAR}");
        }
        
        if (record.getFinishno() != null) {
            sql.VALUES("FINISHNO", "#{finishno,jdbcType=BIGINT}");
        }
        
        if (record.getFreetime() != null) {
            sql.VALUES("FREETIME", "#{freetime,jdbcType=VARCHAR}");
        }
        
        if (record.getImageurls() != null) {
            sql.VALUES("IMAGEURLS", "#{imageurls,jdbcType=VARCHAR}");
        }
        
        if (record.getKind() != null) {
            sql.VALUES("KIND", "#{kind,jdbcType=INTEGER}");
        }
        
        if (record.getLikeno() != null) {
            sql.VALUES("LIKENO", "#{likeno,jdbcType=BIGINT}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("NUMBER", "#{number,jdbcType=INTEGER}");
        }
        
        if (record.getNumeral() != null) {
            sql.VALUES("NUMERAL", "#{numeral,jdbcType=REAL}");
        }
        
        if (record.getOnsale() != null) {
            sql.VALUES("ONSALE", "#{onsale,jdbcType=BIT}");
        }
        
        if (record.getOnshow() != null) {
            sql.VALUES("ONSHOW", "#{onshow,jdbcType=BIT}");
        }
        
        if (record.getPraiseratio() != null) {
            sql.VALUES("PRAISERATIO", "#{praiseratio,jdbcType=REAL}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("PRICE", "#{price,jdbcType=REAL}");
        }
        
        if (record.getPricetemp() != null) {
            sql.VALUES("PRICETEMP", "#{pricetemp,jdbcType=REAL}");
        }
        
        if (record.getQuantifier() != null) {
            sql.VALUES("QUANTIFIER", "#{quantifier,jdbcType=VARCHAR}");
        }
        
        if (record.getRemove() != null) {
            sql.VALUES("REMOVE", "#{remove,jdbcType=BIT}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("SCORE", "#{score,jdbcType=REAL}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("STATE", "#{state,jdbcType=SMALLINT}");
        }
        
        if (record.getSummary() != null) {
            sql.VALUES("SUMMARY", "#{summary,jdbcType=VARCHAR}");
        }
        
        if (record.getTips() != null) {
            sql.VALUES("TIPS", "#{tips,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.VALUES("UPDATETIME", "#{updatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherId() != null) {
            sql.VALUES("TEACHER_ID", "#{teacherId,jdbcType=BIGINT}");
        }
        
        if (record.getCommentno() != null) {
            sql.VALUES("COMMENTNO", "#{commentno,jdbcType=BIGINT}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getTalkway() != null) {
            sql.VALUES("TALKWAY", "#{talkway,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderallno() != null) {
            sql.VALUES("ORDERALLNO", "#{orderallno,jdbcType=BIGINT}");
        }
        
        if (record.getLooknumber() != null) {
            sql.VALUES("LOOKNUMBER", "#{looknumber,jdbcType=BIGINT}");
        }
        
        if (record.getNotify() != null) {
            sql.VALUES("NOTIFY", "#{notify,jdbcType=BIT}");
        }
        
        if (record.getMaskno() != null) {
            sql.VALUES("MASKNO", "#{maskno,jdbcType=BIGINT}");
        }
        
        if (record.getMaskfinishno() != null) {
            sql.VALUES("MASKFINISHNO", "#{maskfinishno,jdbcType=BIGINT}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("CONTENT", "#{content,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Servicepro record) {
        SQL sql = new SQL();
        sql.UPDATE("servicepro");
        
        if (record.getAcceptno() != null) {
            sql.SET("ACCEPTNO = #{acceptno,jdbcType=BIGINT}");
        }
        
        if (record.getAnswerratio() != null) {
            sql.SET("ANSWERRATIO = #{answerratio,jdbcType=REAL}");
        }
        
        if (record.getAnswertime() != null) {
            sql.SET("ANSWERTIME = #{answertime,jdbcType=BIGINT}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("CREATETIME = #{createtime,jdbcType=VARCHAR}");
        }
        
        if (record.getFinishno() != null) {
            sql.SET("FINISHNO = #{finishno,jdbcType=BIGINT}");
        }
        
        if (record.getFreetime() != null) {
            sql.SET("FREETIME = #{freetime,jdbcType=VARCHAR}");
        }
        
        if (record.getImageurls() != null) {
            sql.SET("IMAGEURLS = #{imageurls,jdbcType=VARCHAR}");
        }
        
        if (record.getKind() != null) {
            sql.SET("KIND = #{kind,jdbcType=INTEGER}");
        }
        
        if (record.getLikeno() != null) {
            sql.SET("LIKENO = #{likeno,jdbcType=BIGINT}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("NUMBER = #{number,jdbcType=INTEGER}");
        }
        
        if (record.getNumeral() != null) {
            sql.SET("NUMERAL = #{numeral,jdbcType=REAL}");
        }
        
        if (record.getOnsale() != null) {
            sql.SET("ONSALE = #{onsale,jdbcType=BIT}");
        }
        
        if (record.getOnshow() != null) {
            sql.SET("ONSHOW = #{onshow,jdbcType=BIT}");
        }
        
        if (record.getPraiseratio() != null) {
            sql.SET("PRAISERATIO = #{praiseratio,jdbcType=REAL}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("PRICE = #{price,jdbcType=REAL}");
        }
        
        if (record.getPricetemp() != null) {
            sql.SET("PRICETEMP = #{pricetemp,jdbcType=REAL}");
        }
        
        if (record.getQuantifier() != null) {
            sql.SET("QUANTIFIER = #{quantifier,jdbcType=VARCHAR}");
        }
        
        if (record.getRemove() != null) {
            sql.SET("REMOVE = #{remove,jdbcType=BIT}");
        }
        
        if (record.getScore() != null) {
            sql.SET("SCORE = #{score,jdbcType=REAL}");
        }
        
        if (record.getState() != null) {
            sql.SET("STATE = #{state,jdbcType=SMALLINT}");
        }
        
        if (record.getSummary() != null) {
            sql.SET("SUMMARY = #{summary,jdbcType=VARCHAR}");
        }
        
        if (record.getTips() != null) {
            sql.SET("TIPS = #{tips,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.SET("UPDATETIME = #{updatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherId() != null) {
            sql.SET("TEACHER_ID = #{teacherId,jdbcType=BIGINT}");
        }
        
        if (record.getCommentno() != null) {
            sql.SET("COMMENTNO = #{commentno,jdbcType=BIGINT}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getTalkway() != null) {
            sql.SET("TALKWAY = #{talkway,jdbcType=SMALLINT}");
        }
        
        if (record.getOrderallno() != null) {
            sql.SET("ORDERALLNO = #{orderallno,jdbcType=BIGINT}");
        }
        
        if (record.getLooknumber() != null) {
            sql.SET("LOOKNUMBER = #{looknumber,jdbcType=BIGINT}");
        }
        
        if (record.getNotify() != null) {
            sql.SET("NOTIFY = #{notify,jdbcType=BIT}");
        }
        
        if (record.getMaskno() != null) {
            sql.SET("MASKNO = #{maskno,jdbcType=BIGINT}");
        }
        
        if (record.getMaskfinishno() != null) {
            sql.SET("MASKFINISHNO = #{maskfinishno,jdbcType=BIGINT}");
        }
        
        if (record.getContent() != null) {
            sql.SET("CONTENT = #{content,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("SERVICEPRO_ID = #{serviceproId,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}