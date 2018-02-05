package com.xaver.pract;

import java.util.HashMap;
import java.util.Map;

/**
 * @authore wuyanfeng
 * @description Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @date 2018/2/5
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0 && i != j; j--) {
                if (nums[i] + nums[j] == target) {
                    indexArray[0] = i;
                    indexArray[1] = j;
                    break;
                }
            }
        }
        return indexArray;
    }

    public int[] twoSum2(int[] nums, int target) throws Exception {

        Map<Integer,Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(indexMap.containsKey(target - nums[i])){
              return new int[]{indexMap.get(target - nums[i]),i};
            }
        }
        throw  new Exception();
    }
}
