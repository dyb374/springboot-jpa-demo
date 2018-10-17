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
 * 统一异常处理类,会拦截Controller抛出的异常，用到了@RestControllerAdvice中的@ExceptionHandler注解
 * 在@RestControllerAdvice下还有@ModelAttribute和@InitBinder注解
 * @author Andrew Dong
 * @date 2018/10/9 19:08
 */

@RestControllerAdvice
public class ParamExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(ParamExceptionHandler.class);


    /**
     * 应用到所有@RequestMapping注解的方法，在其抛出BindException异常时执行
     * 处理BindException
     * @param e
     * @return Result或者是前端所需的出错情况下的json数据结构
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
