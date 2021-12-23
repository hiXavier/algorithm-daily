package com.offer.dp;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/8/12 21:50
 */
public class LongestPalindromeSubseq {

    public static int longestPalindromeSeq(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                char cai = s.charAt(i);
                char caj = s.charAt(j);
                if (cai == caj) {
                    int i1j1 = dp[i + 1][j - 1];
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    int i1j = dp[i + 1][j];
                    int ij1 = dp[i][j - 1];
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]); // 作出进一步决策                }
                }
            }
        }
        return dp[0][len - 1];
    }

    public static void main(String[] args) {
        String s = "asssasms";
        int len = longestPalindromeSeq(s);
        System.out.println(len);
    }

}
