package com.offer.array;

import java.util.Arrays;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/6/22 14:40
 */
public class ArrayOperation {
    public static void main(String[] args) {
        int[] ints = new int[10];
        ints[5] = 5;
        Arrays.stream(ints).forEach(num -> System.out.println(num));
    }
}
