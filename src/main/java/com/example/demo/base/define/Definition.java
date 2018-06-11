package com.example.demo.base.define;

/**
 * Created by admin on 2018/6/9 0009.
 */
public enum Definition {
    success("SUCCESS"),
    failed("FAILED"),
    SUCCESS(0, "操作成功"),
    NOUSER(401, "该用户不存在"),
    PWDERROR(402, "密码错误")
    ;

    private Integer errorCode;
    private String msg;

    Definition(String msg) {
        this.msg = msg;
    }

    Definition(Integer errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getMsg() {
        return msg;
    }
}
