package com.erp.exception;

import java.util.concurrent.Executor;

public class MyException extends Exception{

   private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyException(String message) {
        this.message = message;
    }
}