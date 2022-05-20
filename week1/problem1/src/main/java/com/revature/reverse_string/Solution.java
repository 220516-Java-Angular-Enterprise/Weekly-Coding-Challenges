package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        StringBuilder reverse = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        s = reverse.toString();
        return s;
    }
}
