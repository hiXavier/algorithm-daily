package com.offer.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/7/3 17:09
 */
public class FindAllNumbersDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];

            while (num != nums[num]) {
                int tmp = nums[num];
                nums[num] = nums[i];
                nums[i] = tmp;
            }
        }
        List<Integer> lists = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (nums[i] != i) {
                lists.add(i);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> integers = findDisappearedNumbers(nums);

    }
}
