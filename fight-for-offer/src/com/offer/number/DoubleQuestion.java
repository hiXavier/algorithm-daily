package com.offer.number;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/12/23 13:47
 */
public class DoubleQuestion {
    public static void printMinDouble(){
        System.out.println("Minimum double " + Double.MIN_VALUE);
    }

    public static void main(String[] args) {
        printMinDouble();
        System.out.println(Math.min(Double.MIN_VALUE,                                  0.0d));
    }
}
