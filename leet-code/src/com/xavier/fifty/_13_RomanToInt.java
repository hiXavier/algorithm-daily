package com.xavier.fifty;

/**
 * @Author wuyanfeng
 * @Description Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * @Date 2019/8/21 20:32
 */
public class _13_RomanToInt {

    public int romanToInt(String s) {
        char[] ManHandle = new char[s.length()];
        s.getChars(0, s.length(), ManHandle, 0);
        int runningTotal = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) < s.length() && romanTo(ManHandle[i + 1]) > romanTo(ManHandle[i])) {
                runningTotal = runningTotal + (romanTo(ManHandle[i + 1]) - romanTo(ManHandle[i]));
                i++;
            } else {
                runningTotal = runningTotal + romanTo(ManHandle[i]);
            }
        }
        return runningTotal;
    }


    private int romanTo(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
