package com.dyb.demo.entity;

import com.dyb.demo.enums.ResultCode;


/**
 * http请求返回的最外层对象
 * @author Andrew Dong
 * @date 2018/10/9 16:35
 */
public class Result<T> {


    //错误码,成功为200,详见ResultEnum
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;


    public Result() {
    }

    //构造器,用于接收enum
    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
