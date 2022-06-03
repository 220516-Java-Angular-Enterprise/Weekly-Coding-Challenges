package com.revature.problem;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int validWords(String sentence) {
        //Split sentence into array separated by space
        List<String> wordList = Arrays.asList(sentence.split(" "));
        int wordCount = 0;
        boolean isWord = true;
        //Iterate through new array and check for conditions of a valid word.
        for (String s : wordList) {
            //Condition 1: No numbers
            for (char a : s.toCharArray()) {
                if (Character.isDigit(a)) {
                    isWord = false;
                }
            }
            if (s.equals(" ") || s.equals("")) isWord = false;
            //Condition 2: Hyphens to be surrounded by characters.

            if (isWord) {
                    if (s.contains("-")) {
                        int hyphenIndex = s.indexOf("-");
                        if (Character.isLetter(s.charAt(hyphenIndex - 1)) && Character.isLetter(s.charAt(hyphenIndex+ 1))) {
                            wordCount++;
                        }
                    }
                //Condition 3: Punctuations must be at the end of the word.
                    if (s.contains("!")) {
                        int exclamationIndex = s.indexOf("!");
                        if (exclamationIndex == s.length() - 1) {
                            wordCount++;
                        } else isWord = false;
                    }
                    if (s.contains("?")) {
                        int questionIndex = s.indexOf("?");
                        if (questionIndex == s.length() - 1) {
                            wordCount++;
                        } else isWord = false;
                    }
                    if (s.contains(".")) {
                        int periodIndex =  s.indexOf(".");
                        if (periodIndex == (s.length() - 1)) {
                            wordCount++;
                        } else isWord = false;
                    }
            }
            if(isWord){
                wordCount++;
            }
            isWord = true;
        }
        return wordCount;
    }
}
