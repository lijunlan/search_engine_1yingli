package com.junlanli.search.onemile.common.pinyin4j;

import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 19/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class NamePinyinUtil {


    private static final HanyuPinyinOutputFormat nameFormat;

    static {
        nameFormat = new HanyuPinyinOutputFormat();
        nameFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);// 小写
        nameFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);// 没有音调数字
        nameFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
    }


}
