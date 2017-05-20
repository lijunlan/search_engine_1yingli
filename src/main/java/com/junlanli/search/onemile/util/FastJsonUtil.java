package com.junlanli.search.onemile.util;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.common.constant.Code;

/**
 * 快速返回请求工具类
 */
public final class FastJsonUtil {


    public static JSONObject error(int code, String msg) {
        JSONObject result = new JSONObject();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public static JSONObject error(int code, String msg, Object data) {
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
