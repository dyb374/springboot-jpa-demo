package com.dyb.demo.untils;

import com.dyb.demo.entity.Result;
import com.dyb.demo.enums.ResultCode;

/**
 * Result的工具类,用于封装异常处理语句
 * @author Andrew Dong
 * @date 2018/10/9 17:14
 */
public class ResultUtil {


    /**
     * success
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result(ResultCode.CODE_200);
        result.setData(object);
        return result;
    }


    /**
     * success
     * @return
     */
    public static Result success(){
        return success(null);
    }


    /**
     * @param resultCode
     * @return
     */
    public static Result error(ResultCode resultCode){
        Result result = new Result(resultCode);
        result.setData(null);
        return result;
    }
}
