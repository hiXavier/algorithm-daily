package com.offer.sort;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/12/18 14:19
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        mergeSort(arr,0,arr.length-1,tmp);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge(int[] nums,int left,int mid,int right,int[] tmp){
        //左边序列和右边序列起始索引
        int i = 0,j = left,pos = mid+1;
        while(j <= mid && pos <= right){
            tmp[i] = nums[j] < nums[pos] ? nums[j++] : nums[pos++];
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tmp[i++] = nums[j++];
        }
        while(pos <= right){
            tmp[i++] = nums[pos++];
        }
        for(int t=0;t<i;t++){
            nums[left+t] = tmp[t];
        }
    }

    public static void mergeSort(int[] arr,int low,int high,int[] tmp){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid,tmp); //对左边序列进行归并排序
            mergeSort(arr,mid+1,high,tmp);  //对右边序列进行归并排序
            merge(arr,low,mid,high,tmp);    //合并两个有序序列
        }
    }


}
