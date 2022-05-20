package com.revature.reverse_string;

public class Solution {
    String newS = "";
    int count = 1;
    public String reverseString(String s) {
        //base case
        if(count == s.length()){
            return s;
        }else {
            count += 1;
            newS = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            reverseString(newS);
            return newS;
        }
    }
}
