package com.revature.problem;


//Psh-"frEeBiE"... this was the hardest one!
public class Solution {
    public String deleteAllNumbers(String s) {

        StringBuilder str = new StringBuilder(s);
        //s.replaceAll("\\\\d", "");

        for (int i = 0; i < str.length(); i++){//char c : str) {
            if (Character.isDigit(str.charAt(i))) {
                str.replace(i, i+1, "");
                i = i-1;
            }
        }

        return str.toString();


    }
}
