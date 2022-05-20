package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(n)).reverse();
        for(int i = 0; i < builder.length(); i++){
            if(builder.indexOf("0") != -1){
                builder.deleteCharAt(builder.indexOf("0"));
            }
            if(builder.indexOf("-") != -1){
                builder.deleteCharAt(builder.indexOf("-"));
                builder.insert(0, "-");
            }
        }
        return Integer.parseInt(builder.toString());
    }
}
