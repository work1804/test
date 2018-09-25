package com.lth.exception;

public class MsgException extends Exception {
    private String msg;

    public MsgException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
