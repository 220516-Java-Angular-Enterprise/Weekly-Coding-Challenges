package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String[] out = sentence.split(" ");
        HashMap<String, Integer> hMap = new HashMap<>();
        for(String s:out){
            hMap.put(s,hMap.get(s)+1);
        }
        for (int i = 0; i < hMap.size(); i++){
        }
        String a = " ";
        return a;
    }

}
