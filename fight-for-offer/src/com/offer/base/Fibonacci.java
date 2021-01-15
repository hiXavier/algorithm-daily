package com.offer.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/1/7 17:10
 */
public class Fibonacci {

    public static long process(int n, Map<Integer, Long> map) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            map.put(1, 1L);
            return 1;
        }
        if (n == 2) {
            map.put(2, 2L);
            return 2;
        }
        if (map.get(n) != null) {
            long nValue = map.get(n);
            System.out.println("获取n = " + nValue);
            return nValue;
        }
        long n1 = map.get(n - 1) != null ? map.get(n - 1) : process(n - 1, map);
        long n2 = map.get(n - 2) != null ? map.get(n - 2) : process(n - 2, map);
        long nV = n1 + n2;
        map.put(n, nV);
        System.out.println("map push n = " + n + " , 值= " + nV);
        return n1 + n2;
    }

    public static long process(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long nV = process(n - 1) + process(n - 2);
        System.out.println("n = " + nV);
        return nV;
    }

    public static void main(String[] args) {
        int n = 20;
        Map<Integer, Long> map = new HashMap<>(20);
        long start = System.currentTimeMillis();
        long sum = process(n, map);
        System.out.println("备忘录共消耗时间=" + (System.currentTimeMillis() - start));
        System.out.println("备忘录最终值=" + sum);
        start = System.currentTimeMillis();
        sum = process(n);
        System.out.println("普通共消耗时间=" + (System.currentTimeMillis() - start));
        System.out.println("最终值=" + sum);
    }
}
