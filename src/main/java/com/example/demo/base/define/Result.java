package com.example.demo.base.define;

/**
 * Created by admin on 2018/6/9 0009.
 */
public class Result<T> {

    private Definition status;
    private String msg;
    private int errorCode;
    private T data;

    public Result() {
    }

    public static Result error(int errorCode, String msg) {
        Result result = new Result();
        result.setStatus(Definition.failed);
        result.setErrorCode(errorCode);
        result.setMsg(msg);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setStatus(Definition.success);
        result.setErrorCode(Definition.SUCCESS.getErrorCode());
        result.setMsg(Definition.SUCCESS.getMsg());
        return result;
    }

    public Definition getStatus() {
        return status;
    }

    public void setStatus(Definition status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}