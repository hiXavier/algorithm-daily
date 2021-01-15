package com.offer.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/6/22 14:08
 */
public class ChineseCharacter {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char[] chars = new char[]{'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));


        String a = "名";
        System.out.println("UTF-8编码长度:" + a.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:" + a.getBytes("GBK").length);
        System.out.println("GB2312编码长度:" + a.getBytes("GB2312").length);
        System.out.println("==========================================");

        String c = "0x20001";
        System.out.println("UTF-8编码长度:" + c.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:" + c.getBytes("GBK").length);
        System.out.println("GB2312编码长度:" + c.getBytes("GB2312").length);
        System.out.println("==========================================");

        char[] arr = Character.toChars(0x20001);
        String s = new String(arr);
        System.out.println("char array length:" + arr.length);
        System.out.println("content:|  " + s + " |");
        System.out.println("String length:" + s.length());
        System.out.println("UTF-8编码长度:" + s.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:" + s.getBytes("GBK").length);
        System.out.println("GB2312编码长度:" + s.getBytes("GB2312").length);
        System.out.println("==========================================");

        System.out.printf("The max value of type char is %d.%n",
                (int)Character.MAX_VALUE);
        System.out.printf("The min value of type char is %d.%n",
                (int)Character.MIN_VALUE);

    }
}
