package com.offer.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/7/12 17:26
 */
public class ArraysTest {
    public static void main(String[] args) {
        testSubList();

        int[] arr = {1, 2, 3};
        List list = Arrays.asList(arr);
        System.out.println(String.format("list:%s size:%s class:%s", list, list.size(), list.get(0).getClass()));
        String[] strs = {"1", "2", "3"};
        List lists = Arrays.asList(strs);
        System.out.println(String.format("list:%s size:%s class:%s", lists, lists.size(), lists.get(0).getClass()));
    }

    public static void testSubList() {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        List<Integer> sublist = list.subList(1, 4);
        System.out.println(sublist);
        sublist.remove(1);
        System.out.println(list);
        list.add(0);
        try {
            sublist.forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void testArray() {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        list.remove(1);
        List<Integer> sublist = list.subList(1, 4);
        System.out.println(sublist);
        sublist.remove(1);
        System.out.println(list);
        list.add(0);
        try {
            sublist.forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
