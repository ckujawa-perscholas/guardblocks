package com.perscholas.inclass.threading.concurrencyex1.guardedblocks;

public class Message {

    private String msg;

    public Message(String s){
        this.msg = s;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}

