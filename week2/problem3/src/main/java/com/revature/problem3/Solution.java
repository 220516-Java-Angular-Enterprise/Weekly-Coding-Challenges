package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {

        sentence = sentence.toLowerCase();

        List<String> keys = new ArrayList<String>();
        List<Integer> values = new ArrayList<Integer>();

        //HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        String[] separatedWords = sentence.split(" ");

        for(int i = 0; i < separatedWords.length; i++){
            if (separatedWords[i].equals(" ") || separatedWords[i].equals(""))
                continue;
            if(keys.contains(separatedWords[i])){
                values.set(i, values.get(i) + 1);
            }
            else {
                keys.add(separatedWords[i]);
                values.add(1);
            }
        }

        String returnValue = "";

        for(int i = 0; i < keys.size(); i ++){
            returnValue += keys.get(i) + ": " + values.get(i) + "\n";
        }


        return returnValue;





    }
}
