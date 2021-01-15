package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/1/11 19:44
 */
public class StringStudy {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println("s ==s2 " + s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println("s3 ==s4 " + s3 == s4);
    }


    public static void test2() {
        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println("s ==s2 " + s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println("s3 ==s4 " + s3 == s4);
    }
}