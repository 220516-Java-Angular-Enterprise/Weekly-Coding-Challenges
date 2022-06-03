package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        // simple dictionar
        // go through list if word not in dictonary add and appen one if in dict then lookup and val +1
        Map<String, Integer> count = new HashMap<>();

        StringBuilder word = new StringBuilder();

        for (int i  = 0; i < sentence.length(); i++){
            if(sentence.charAt(i)  == ' '){
                if (count.containsKey(word.toString())){
                    count.put(word.toString(),count.get(word.toString()) +1);
                } else {
                    count.put(word.toString(),1);
                }
                word.setLength(0);
            }else{
                word.append(sentence.substring(i));
            }
        }

        throw new RuntimeException("TODO! Needs implementation...");
    }
}
