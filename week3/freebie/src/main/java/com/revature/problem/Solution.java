package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s) {
        String noNum = s.replaceAll("\\d","");
        return noNum;
    }
}
