package com.erp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IDUtil {

    private final static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
            'Z', '+', '/',};

    /**
     * 图片名生成
     */
    public static String genImageName() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上三位随机数
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis + String.format("%03d", end3);
        return str;
    }

    /**
     * 商品id生成
     */
    public static String genItemId(DepartmentName name) {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(999999);
        millis = millis * 1000000 + end2;
        //如果不足两位前面补0 String str = CompressNumber(millis);
        String sid = name.getAbbreviation() + Long.toString(millis, 32);
        return sid;
    }


//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            String s = genItemId(DepartmentName.AFTER_SALES_DEPARTMENT);
////            System.out.println(s);
////            System.out.println(s.substring(0, 3));
////            System.out.println(getDepartmentById(s));
//            System.out.println(getGmtCreateById(s,true));
//        }
//    }

    /**
     * 通过id返回部门名称
     * @param id
     * @return
     */
    public static String getDepartmentById(String id) {
        String str = id.substring(0, 3);
        if ("SHB".equals(str)) {
            return DepartmentName.AFTER_SALES_DEPARTMENT.getDepartment();
        } else if ("RSB".equals(str)) {
            return DepartmentName.PERSONNEL_DEPARTMENT.getDepartment();
        } else if ("XSB".equals(str)) {
            return DepartmentName.SALES_DEPARTMENT.getDepartment();
        } else if ("SGB".equals(str)) {
            return DepartmentName.COMMODITY_MANAGEMENT_DEPARTMENT.getDepartment();
        } else {
            return null;
        }
    }


    /**
     *  通过id获取时间
     * @param id
     * @return
     */
    public static String getGmtCreateById(String id ,Boolean includingTime) {
        String millis = id.substring(3, id.length());
        Long aLong = Long.valueOf( millis ,32) / 1000000;
        String s = null;
        if (includingTime){
            s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(aLong));
        } else {
            s = new SimpleDateFormat("yyyy-MM-dd").format(new Date(aLong));
        }
        return s;
    }


    /**
     * 把10进制的数字转换成64进制
     *
     * @param number
     * @return
     */
    private static String CompressNumber(long number) {
        char[] buf = new char[64];
        int charPos = 64;
        int radix = 1 << 6;
        long mask = radix - 1;
        do {
            buf[--charPos] = digits[(int) (number & mask)];
            number >>>= 6;
        } while (number != 0);
        return new String(buf, charPos, (64 - charPos));
    }
}
