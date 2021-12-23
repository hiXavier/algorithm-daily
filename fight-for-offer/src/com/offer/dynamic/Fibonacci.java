package com.offer.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/7/15 11:19
 */
public class Fibonacci {

    public static Map<Integer, Integer> memoMap = new HashMap<>();

    public static int fibon(int n) {
        if (n <= 0) {
            memoMap.put(n,0);
            return 0;
        }
        if (n < 3) {
            memoMap.put(n,1);
            return 1;
        }
        if(memoMap.get(n) != null){
            return memoMap.get(n);
        }
        if(memoMap.get(n - 1) != null && memoMap.get(n -2) != null){
            int fn = memoMap.get(n - 1) + memoMap.get(n -2);
            memoMap.put(n,fn);
            return fn;
        }
        return fibon(n - 1) + fibon(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fibon(0));
        System.out.println(fibon(1));
        System.out.println(fibon(2));
        System.out.println(fibon(3));
        System.out.println(fibon(4));
        System.out.println(fibon(5));

    }

}
