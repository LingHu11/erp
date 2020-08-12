package com.erp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class PenautUtiles {
    public static String timeToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);
        return str;
    }
}
