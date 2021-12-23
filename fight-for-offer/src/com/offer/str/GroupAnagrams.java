package com.offer.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/7/18 15:55
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagram(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> s.chars() // Map<IntStream,List>
                        .mapToObj(String::valueOf) // Map<Stream<String>, List>
                        .sorted()
                        .reduce(String::concat))) // Map<String, List>
                .values()); // List
    }


}
