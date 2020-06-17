package com.offer.array;

/**
 * 找出数组中重复数字
 * 长度为n的数组中数字范围为0~n-1,找出重复数字
 * {2, 3, 1, 0, 2, 5, 3}返回2或3
 * @Author wuyanfeng
 * @Description
 * @Date 2020/6/16 17:00
 */
public class FindDupNum {

    /**
     * 利用数组连续内存特点，下标可作用Map中key使用
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param nums
     * @return
     */
    public static int process(int[] nums) {
        int length = nums.length;
        if (nums == null && length == 0) {
            return -1;
        }
        for (int num : nums) {
            if (num < 0 || num >= length) {
                return -1;
            }
        }

        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                }
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int num = process(nums);
        System.out.println(num);
    }
}
