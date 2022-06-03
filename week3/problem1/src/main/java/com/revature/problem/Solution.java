package com.revature.problem;

import java.util.Stack;

public class Solution {
    public int validWords(String sentence) {
        int sol = 0;
        boolean checker = false;
        String[] arr = sentence.split("\\s+");
        for(String out: arr){
            for(int i = 0; i < out.length(); i++){
                char ch = out.charAt(i);
                if(out.contains("0") ||
                        out.contains("1")||
                        out.contains("2")||
                        out.contains("3")||
                        out.contains("4")||
                        out.contains("5")||
                        out.contains("6")||
                        out.contains("7")||
                        out.contains("8")||
                        out.contains("9")){
                    checker = false;
                    break;
                }
                if(ch == '.' || ch == '!' || ch == ','){
                    if(i != out.length()-1){
                        System.out.println("Invalid");
                        checker = false;
                        break;
                    }
                }
                if(ch == '-') {
                    if (i == out.length() - 1 || i == 0) {
                        checker = false;
                        break;

                    }
                    if (!Character.isAlphabetic(out.charAt(i - 1)) || !Character.isAlphabetic(out.charAt(i + 1))) {
                        checker = false;
                        break;
                    }
                }
                checker = true;
            }
            if(checker){
                sol++;
            }
            System.out.println(out);
        }
        return sol;
    }
}
