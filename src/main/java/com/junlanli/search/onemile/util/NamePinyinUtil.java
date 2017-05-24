package com.junlanli.search.onemile.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import net.sourceforge.pinyin4j.multipinyin.MultiPinyinConfig;
import org.apache.log4j.Logger;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 19/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class NamePinyinUtil {

    private static final Logger logger = Logger.getLogger(NamePinyinUtil.class);


    private static final HanyuPinyinOutputFormat nameFormat;

    static {
        nameFormat = new HanyuPinyinOutputFormat();
        nameFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);// 小写
        nameFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);// 没有音调数字
        nameFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
        MultiPinyinConfig.multiPinyinPath = "/mapping/pinyin.dic";
    }

    public static String transferName(String chinese) {
        try {
            return PinyinHelper.toHanYuPinyinString(chinese, nameFormat, "", false);
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            logger.error("failed to transfer name to pinyin", e);
            return "";
        }
    }

    public static String transferSimpleName(String chinese) {
        try {

            StringBuilder sb = new StringBuilder();
            for (char word : chinese.toCharArray()) {
                String py = PinyinHelper.toHanYuPinyinString(new String(new char[]{word}), nameFormat, "", false);
                if (py.length() == 0) continue;
                sb.append(py.charAt(0));
            }
//            logger.info(String.format("whole word: %s, simple pinyin: %s", chinese, sb.toString()));
            return sb.toString();
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            logger.error("failed to transfer name to pinyin", e);
            return "";
        }
    }


}
