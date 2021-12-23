package com.offer;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/9/14 19:55
 */
public class Demo {
    public static void main(String[] args) {
        int num = 50;
        int mode = num % -11;
        int negNode = -num % 11;
        int poNode = -num % -11;
        int d1 = num / 11;
        double d2 = num / 11.0;
        double d3 = 50.0 / 11.0;
        System.out.println(num);
    }
}

