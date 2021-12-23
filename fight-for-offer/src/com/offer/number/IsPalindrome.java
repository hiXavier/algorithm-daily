package com.offer.number;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/6/27 18:07
 */
public class IsPalindrome {

    public static boolean isPalindromeNum(int x) {
        if (x < 0) {
            return false;
        }
        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindromeNum(x);
    }
}
