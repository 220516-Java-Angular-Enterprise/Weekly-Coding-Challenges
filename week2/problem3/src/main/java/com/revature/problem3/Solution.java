package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        StringBuilder wordcount = new StringBuilder();
        String[] arr = sentence.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr){
            if(!s.equals(""))
                map.put(s, map.containsKey(s) ? map.get(s)+1:1);
        }

        for(Map.Entry<String, Integer> s : map.entrySet()){
            if(map.get(s.getKey())>1)
                wordcount.append(s.getKey()).append(": ").append(s.getValue()).append("\n");
        }
        return wordcount.toString();
    }
}
