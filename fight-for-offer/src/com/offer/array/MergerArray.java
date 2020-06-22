package com.offer.array;

/**
 * @author wuyanfeng
 * @description 合并两个排序好的数组
 * 时间复杂度 O(n)
 * 空间复杂度 0(n)
 * @date 2020/6/22 14:55
 */
public class MergerArray {

    public static int[] process(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;
        int cLength = aLength + bLength;
        int[] c = new int[cLength];
        int i = 0, j = 0, k = 0;
        while (j < bLength && i < aLength) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < aLength) {
            c[k++] = a[i++];
        }
        while (j < bLength) {
            c[k++] = b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = process(a, b);
        System.out.println("======");
    }
}
