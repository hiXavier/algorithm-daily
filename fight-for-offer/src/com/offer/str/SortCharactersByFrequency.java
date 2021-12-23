package com.offer.str;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/7/3 15:35
 */
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int slength = s.length();
        Map<Character, Integer> charMap = new HashMap<>(slength);
        for (int i = 0; i < slength; i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> characterList = charMap.entrySet().stream().map(Map.Entry::getKey).sorted((k1, k2) -> charMap.get(k2) - charMap.get(k1)).collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        for (char sChar : characterList) {
            int count = charMap.get(sChar);
            for (int times = 0; times < count; times++) {
                stringBuilder.append(sChar);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String print1 = frequencySort("tree");
        System.out.println(print1);
    }
}
