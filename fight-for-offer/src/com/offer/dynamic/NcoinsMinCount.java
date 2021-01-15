package com.offer.dynamic;

import java.util.Arrays;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/1/7 14:47
 */
public class NcoinsMinCount {

    private static void getMinCoinCountOfValue() {
        // 硬币面值
        int[] values = {5, 3};
        // 总价
        int total = 11;
        int minCoinCount = getMinCoinCountOfValueHelper(total, values);
        // 输出结果
        System.out.println(minCoinCount);
    }

    /**
     * @param total 金额
     * @param coins 币种数组，从大到小排序
     * @return 返回币数，如果返回-1表示无法凑够total
     */
    private static int getMinCoinCountOfValueHelper(int total, int[] coins) {
        if (coins == null || coins.length == 0 || total < coins[coins.length - 1]) {
            return -1;
        }
        //当前币值
        int currentCoin = coins[0];
        //使用当前币值数量
        int useCurrentCoinCount = total / currentCoin;
        int restTotal = total - useCurrentCoinCount * currentCoin;
        // 如果restTotal为0，表示余额已除尽，组合完成
        if (restTotal == 0) {
            return useCurrentCoinCount;
        }
        // 其他币种数量
        int coinCount = -1;
        // 剩余的币种
        int[] restCoins = Arrays.copyOfRange(coins, 1, coins.length);
        while (useCurrentCoinCount >= 0) {
            // 否则尝试用剩余面值求当前余额的硬币总数
            coinCount = getMinCoinCountOfValueHelper(restTotal, restCoins);
            // 如果后续没有有可用组合,退一步，当前useCurrentCoinCount币数减1
            if (coinCount == -1) {
                // 否则尝试把当前面值数-1
                useCurrentCoinCount--;
                // 重新计算restTotal
                restTotal = total - useCurrentCoinCount * currentCoin;
            } else {
                return useCurrentCoinCount + coinCount;
            }
        }
        return -1;
    }
}
