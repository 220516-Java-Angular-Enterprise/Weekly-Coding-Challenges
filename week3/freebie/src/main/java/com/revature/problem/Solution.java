package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s) {
        String anw = "";

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){

            }else {
                anw += c;
            }
        }
        return anw;
    }
}
