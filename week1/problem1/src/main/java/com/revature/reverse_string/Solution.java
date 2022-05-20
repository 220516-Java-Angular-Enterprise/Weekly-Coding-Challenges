package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        // Revers the string
        String rev = "";
        int j = 0;

        if ( s.length() > 0) {
            for (int i = s.length()-1; i >= 0; i--) {
                rev += s.charAt(i);
            }
        }
        return rev;
    }
}
