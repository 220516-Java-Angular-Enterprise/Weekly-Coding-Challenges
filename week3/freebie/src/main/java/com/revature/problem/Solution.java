package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s){
        char[] arr = s.toCharArray();
        String str= "";
        for(int i = 0; i < arr.length; i++){
            if(Character.isAlphabetic(arr[i])){
                str = str + arr[i];
            }
        }
        return str;
    }
}
