package com.erp.utils;

public class Result {
    private String msg;
    private String code;
    private String name;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Result(String code,String msg,  String name) {
        this.msg = msg;
        this.code = code;
        this.name = name;
    }

    public Result(String code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public Result() {
    }
}
