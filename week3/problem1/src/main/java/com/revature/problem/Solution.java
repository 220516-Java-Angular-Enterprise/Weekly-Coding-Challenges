package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        int count = 0;
        char[] charSearch = {'-','!','.'};

        for (String word : sentence.split(" ")) {


            for(int i=0; i<word.length(); i++)
            {
                char chr = word.charAt(i);
                if (Character.isSpaceChar(chr)){
                    break;}
                if (Character.isDigit(chr)){
                    break;}
                if (Character.isUpperCase(chr)){
                    break;}
                count++;
            }

            }

        return count;

        //throw new RuntimeException("TODO! Needs implementation...");
    }
}
