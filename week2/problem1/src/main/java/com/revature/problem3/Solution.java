package com.revature.problem3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public void wordCount(String str) {
        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);
    }

}