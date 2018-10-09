package com.dyb.demo.handler;

import com.dyb.demo.entity.Result;
import com.dyb.demo.enums.ResultCode;
import com.dyb.demo.untils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理类,会拦截Controller抛出的异常
 * @author Andrew Dong
 * @date 2018/10/9 19:08
 */

@RestControllerAdvice
public class ParamExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(ParamExceptionHandler.class);


    /**
     * 处理BindException
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result handler(BindException e){
        logger.info("拦截到异常");
        Result result = ResultUtil.error(ResultCode.CODE_401);
        result.setMsg(e.getFieldError().getDefaultMessage());
        return result;
    }
}
