package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String[] myArr = sentence.split(" ");

        String currString = myArr[0];
        int count = 0;

        for(String i : myArr){
            if(currString.equals(i)){
                count += 1;
            }
        }
        return "";
    }
}
