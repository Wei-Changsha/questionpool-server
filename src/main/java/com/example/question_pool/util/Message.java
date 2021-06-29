package com.example.question_pool.util;

public class Message {
    private Integer code;
    private String msg;
    private Object object;


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

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void addMessage(Boolean success, String successMsg, String failMsg){
        if (success){
            addSuccessMsg(successMsg);
        } else {
            addFailMsg(failMsg);
        }
    }

    public void addSuccessMsg(String successMsg){
        setCode(1);
        setMsg(successMsg);
    }

    public void addFailMsg(String failMsg){
        setCode(0);
        setMsg(failMsg);
    }

    public String toJson(){
        return JacksonUtil.Bean2Json(this);
    }
}
