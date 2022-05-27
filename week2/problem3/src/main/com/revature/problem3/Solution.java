package com.revature.problem3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public Solution() {
    }

    public String wordCount(String sentence) {
        String[] arr = sentence.split(" ", 0);
        HashMap<String, Integer> initial = new HashMap();
        HashMap<String, Integer> result = new HashMap();
        StringBuilder builder = new StringBuilder();
        String[] var6 = arr;
        int var7 = arr.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            String word = var6[var8];
            if (initial.containsKey(word)) {
                int updatedCount = (Integer)initial.get(word) + 1;
                initial.put(word, updatedCount);
            } else {
                initial.put(word, 1);
            }
        }

        Iterator var11 = initial.entrySet().iterator();

        Map.Entry entry;
        while(var11.hasNext()) {
            entry = (Map.Entry)var11.next();
            if ((Integer)entry.getValue() > 1) {
                result.put((String)entry.getKey(), (Integer)entry.getValue());
            }
        }

        var11 = result.entrySet().iterator();

        while(var11.hasNext()) {
            entry = (Map.Entry)var11.next();
            builder.append((String)entry.getKey() + ": " + entry.getValue() + "\n");
        }

        String output = builder.toString();
        return output.substring(0, output.length() - 2);
    }
}