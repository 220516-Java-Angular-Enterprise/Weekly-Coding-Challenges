package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
