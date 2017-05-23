package com.junlanli.search.onemile.controller.advice;

import com.alibaba.fastjson.JSONObject;
import com.junlanli.search.onemile.common.constant.Code;
import com.junlanli.search.onemile.util.FastJsonUtil;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 22/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    private static final Logger logger = Logger.getLogger(ExceptionControllerAdvice.class);

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public JSONObject handleException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return FastJsonUtil.error(Code.INTERNAL_ERROR, "internal error");
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public JSONObject handleMethodNotSupportException(HttpRequestMethodNotSupportedException ex) {
//        logger.info(ex.getMessage());MissingServletRequestParameterException
        return FastJsonUtil.error(Code.METHOD_WRONG, ex.getMessage());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public JSONObject handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
//        logger.info(ex.getMessage());
        return FastJsonUtil.error(Code.PARAMETER_WRONG, ex.getMessage());
    }

}
