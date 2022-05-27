package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {

//        need to split array by spaces
        String[] words = sentence.split(" ");

//        set a var for count
        int count = 0;
        String ans = ("" + count);

//        create for loop to go through new array
//        only do one word, need to look at a[i] compare to whole string, then a[i+1] etc...
        for (int i = 0; i <words.length; i++) {
            if (words.equals(words[i])) {
                count ++;
            }
        }

        return ans;
    }
}
