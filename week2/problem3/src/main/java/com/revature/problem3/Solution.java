package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        int num = 0;
        String word[] = sentence.split(" ");

        for(int i = 0; i < word.length; i++){
            for(int j = 0; j < word.length; j++){
                if(word[i].equals(word[j])){
                    num++;
                }

            }
        }
        return null;
    }
}
