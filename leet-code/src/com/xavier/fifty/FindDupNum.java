package com.xavier.fifty;

/**
 * @Author wuyanfeng
 * @Description
 * @Date 2020/6/16 16:20
 */
public class FindDupNum {

    public static int process(int[] nums) {
        if (nums == null && nums.length == 0) {
            return -1;
        }
        int length = nums.length;
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            if (ints[i] == i && i != 0) {
                return i;
            }
            if (ints[i] != i) {
                ints[i] = i;
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
