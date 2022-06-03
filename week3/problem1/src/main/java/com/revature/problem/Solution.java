package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        sentence.toCharArray();
        int wordcount =0;

        for(int i=0; i<sentence.length(); i++) {
            if(!Character.isDigit(sentence.charAt(i)) && sentence.charAt(i) != ' ') {
                System.out.println(sentence.charAt(i));
            continue;
            }
            wordcount++;
        }
        return wordcount;

    }
}
