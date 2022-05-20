package com.revature.solution;

public class Solution {

    public String reverseString(String s) {
        String newString = "";
        int lastCharSpot = s.length()-1;


        for(int i = lastCharSpot; i >= 0; i--){
            newString += s.charAt(i);
            System.out.println(newString);
        }
        return newString;
}
}
