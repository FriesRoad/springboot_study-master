package com.test.course02_demo.entity;

public class JsonResult<T>{

    private T data;
    private String code;
    private String msg;

    //无数据返回，默认值为0，返回成功
    public JsonResult(){
        this.code = "0";
        this.msg = "操作成功";
    }

    //无数据返回，人为指定状态码和返回值
    public JsonResult(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    //有数据返回，状态码为0，返回成功
    public JsonResult(T data){
        this.data = data;
        this.code = "0";
        this.msg = "操作成功";
    }

    //有数据返回，状态码0，认为指定信息
    public JsonResult(T data, String msg){
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }

    public JsonResult(T data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
