package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        int count = 0;
        //loop through sentence
        //while no space
        //if no digits, hyphen comes before and after letter, and punctuation is at end of token

        for(int i = 0; i < sentence.length(); i++){
            while(!String.valueOf(sentence.charAt(i)).equals(" ")){
                if(Character.isDigit(sentence.charAt(i)))
                {
                    count += 1;
                    System.out.println(count);
                }
            }
        }
        return count;
    }
}
