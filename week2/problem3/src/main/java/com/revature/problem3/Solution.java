package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String lcString = sentence.toLowerCase();
        String[] strArray = lcString.split(" ");
        StringBuilder returnString = new StringBuilder("{");
        HashMap wordCount = new HashMap();
        for(String i :strArray){
            int counter = 1;
            wordCount.put(i, counter);
            if(wordCount.containsKey(i)){
                int count = (int) wordCount.get(i);
                wordCount.put(i, count++);
            }
        }
        for(Object i:wordCount.keySet()){
            returnString.append(i+": "+wordCount.get(i)+"\n");
        }
        return returnString.toString();
    }
}
