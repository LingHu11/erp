package com.erp.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class EmbedIdAndTime<T> {

    public void embedIdAndDate(T t) {
        try {
            Class<?> clazz = t.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
                String name = field.getName();
                Class type = field.getType();
                Object value = field.get(t);
                if (name.equals("id")) {
                    Method setId = clazz.getMethod("setId", type);
                    setId.invoke(t,IDUtil.getItemId());
                }
                if (name.equals("gmtCreate")) {
                    Date date = new Date();
                    Method setCTime = clazz.getMethod("setGmtCreate", type);
                    setCTime.invoke(t, date);
                    Method setMTime = clazz.getMethod("setGmtModified", type);
                    setMTime.invoke(t, date);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

//class test {
//    public static void main(String[] args) throws MyException {
//        EmbedIdAndTime<MgtUser> embedIdAndTime = new EmbedIdAndTime<MgtUser>();
//        MgtUser u = new MgtUser();
//        MgtUser mgtUser = embedIdAndTime.embedIdAndDate(u, DepartmentName.AFTER_SALES_DEPARTMENT);
//        System.out.println(mgtUser);
//    }
//}
