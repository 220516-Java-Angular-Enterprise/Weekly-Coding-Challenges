package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        String reversed="";
        for(int i=0;i<s.length();i++)
        {
            reversed=s.charAt(i)+reversed;
        }
    return reversed;

    }
}
