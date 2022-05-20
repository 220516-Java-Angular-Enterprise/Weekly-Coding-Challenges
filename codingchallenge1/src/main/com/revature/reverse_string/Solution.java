package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s){
        String reverse = "";
        char a;


        for(int i = s.length()-1; i >= 0; i--){
            a = s.charAt(i);
            reverse += a;

        }
        return reverse;
    }
}
