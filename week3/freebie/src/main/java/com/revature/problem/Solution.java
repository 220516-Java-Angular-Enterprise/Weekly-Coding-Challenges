package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String string) {
        string.toCharArray();
        String result = "";

        for(int i=0; i<string.length();i++) {
            if(!Character.isDigit(string.charAt(i))) {
                result += (string.charAt(i));
            }
        }
        return result;
    }
}
