package com.erp.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
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
    public static String getStackTrace(Throwable throwable)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try
        {
            throwable.printStackTrace(pw);
            return sw.toString();
        } finally
        {
            pw.close();
        }
    }
}
