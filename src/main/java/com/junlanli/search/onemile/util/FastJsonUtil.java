package com.junlanli.search.onemile.util;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.common.constant.Code;


/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * <p>Created on 16/05/2017.
 * <p>
 * <p>response json creator
 *
 * @author: lijunlan888@gmail.com
 */
public final class FastJsonUtil {


    public static JSONObject error(Code code, String msg) {
        JSONObject result = new JSONObject();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public static JSONObject error(Code code, String msg, Object data) {
        JSONObject result = new JSONObject();
        result.put("code", code);
        result.put("data", data);
        result.put("msg", msg);
        return result;
    }


    public static JSONObject success(String msg, Object data) {
        JSONObject result = new JSONObject();
        result.put("code", Code.SUCCESS);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }

    public static JSONObject success(Object data) {
        JSONObject result = new JSONObject();
        result.put("code", Code.SUCCESS);
        result.put("msg", "success");
        result.put("data", data);
        return result;
    }

    public static JSONObject success() {
        JSONObject result = new JSONObject();
        result.put("code", Code.SUCCESS);
        result.put("msg", "success");
        return result;
    }

    public static JSONObject success(String msg) {
        JSONObject result = new JSONObject();
        result.put("code", Code.SUCCESS);
        result.put("msg", msg);
        return result;
    }


}
