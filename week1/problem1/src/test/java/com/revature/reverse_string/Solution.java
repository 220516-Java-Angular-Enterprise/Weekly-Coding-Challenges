package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        String outString="";
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(s.length()-1-i);
            outString = outString.concat(Character.toString(c));
        }
        return outString;
    }
}
