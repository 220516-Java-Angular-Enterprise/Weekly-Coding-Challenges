package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s) {

        String result = "";
        char[] ch = s.toCharArray();

        for(int i =0; i < ch.length; i++){
            if (!Character.isDigit(ch[i])) {
                result = result + ch[i];

            }
        }
        return result;

    }
}
