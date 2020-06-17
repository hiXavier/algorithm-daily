package com.offer.array;

/**
 * @Author wuyanfeng
 * @Description 二维数组行从左到右递增，列从上到下递增，查找某数是否在数组中存在
 * 输入：
 * 1 2  8  9
 * 2 4  9 12
 * 4 7 10 13
 * 6 8 11 15
 * 查找 7
 * @Date 2020/6/17 10:25
 */
public class DyadicArrayNum {

    /**
     * 根据递增性质，选取右上角或左下角，进而一步步减少范围
     *
     * @param nums
     * @param row
     * @param column
     * @param target
     * @return
     */
    public static boolean process(int[][] nums, int row, int column, int target) {
        //边缘条件稍后补充
        if (nums == null || nums.length < 1) {
            return false;
        }
        int i = 0;
        int j = column - 1;
        while (i < row && j >= 0) {
            if (nums[i][j] == target) {
                return true;
            } else if (nums[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] ints = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean isExist = process(ints, 4, 4, 7);
        System.out.println("存在" + isExist);
    }
}
