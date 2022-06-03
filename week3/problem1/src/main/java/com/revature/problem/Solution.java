package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int validWords(String sentence) {
        String[] words = sentence.split("\\s+", 0);
        int wordCount = 0;
        for(String word: words){
            int hyphenCount = 0;
            boolean validHyphen = true;
            boolean hasDigit = false;
            boolean validPunctuation = true;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == '-'){
                    if(i > 0 && i < word.length()){
                        hyphenCount++;
                    }
                    else{
                        validHyphen = false;
                        System.out.println(word);
                    }
                }
                if(Character.isDigit(word.charAt(i))){
                    hasDigit = true;
                }
                if(word.charAt(i) == '!' ||
                        word.charAt(i) == '.' ||
                        word.charAt(i) == ','){
                    if(i != word.length() - 1){
                        validPunctuation = false;
                    }
                }
            }
            if(hyphenCount < 2 && validHyphen && !hasDigit && validPunctuation){
                wordCount++;
            }
        }
        /*for(String word: words){
            System.out.println(word);
        }*/
        return wordCount;
    }
}
