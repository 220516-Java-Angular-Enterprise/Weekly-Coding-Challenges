package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        String reverse  = "";
        int l = s.length();

        for (int i = 0; i < l; i++){
            reverse = reverse + s.charAt(l-1- i);
        }
      return reverse;
    }
}
