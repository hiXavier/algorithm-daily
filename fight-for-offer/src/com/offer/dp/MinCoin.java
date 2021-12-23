package com.offer.dp;

import java.util.Arrays;
import java.util.Stack;

public class MinCoin {
    /**
     *
     * @param k 个数
     * @param values 硬币的值
     * @return
     */
    int getMinCounts(int k, int[] values) {
        int[] memo = new int[k + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0; // 初始化状态
        for (int v = 1; v <= k; v++) {
            int minCount = k + 1; // 模拟无穷大
            for (int i = 0; i < values.length; ++i) {
                int currentValue = values[i];
                // 如果当前面值大于硬币总额，那么跳过
                if (currentValue > v) { continue; }
                // 使用当前面值，得到剩余硬币总额
                int rest = v - currentValue;
                int restCount = memo[rest];
                // 如果返回-1，说明组合不可信，跳过
                if (restCount == -1) { continue; }
                // 保留最小总额
                int kCount = 1 + restCount;
                if (kCount < minCount) { minCount = kCount; }
            }
            // 如果是可用组合，记录结果
            if (minCount != k + 1) { memo[v] = minCount; }
        }
        return memo[k];
    }

    int getMinCountsDPSol() {
        int[] values = { 3, 5 }; // 硬币面值
        int total = 22; // 总值
        // 求得最小的硬币数量
        return getMinCountsUpdate(total, values); // 输出答案
    }

    public static void main(String[] args) {
        new MinCoin().getMinCountsDPSol();
    }


    int getMinCountsUpdate(int k, int[] values) {
        int[] memo = new int[k + 1]; // 创建备忘录
        memo[0] = 0; // 初始化状态
        for (int i = 1; i < k + 1; i++) { memo[i] = k + 1; }

        for (int i = 1; i < k + 1; i++) {
            for (int coin : values) {
                if (i - coin < 0) { continue; }
                memo[i] = Math.min(memo[i], memo[i - coin] + 1); // 作出决策
            }
        }

        return memo[k] == k + 1 ? -1 : memo[k];
    }

    int getMinCountsDPSolAdvance() {
        int[] values = { 3, 5 }; // 硬币面值
        int total = 22; // 总值

        return getMinCounts(total, values); // 输出答案
    }
}
