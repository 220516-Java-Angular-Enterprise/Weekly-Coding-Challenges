package com.revature.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private boolean isValid(String word) {
        //no hyphens on the ends
        if(word.startsWith("-") || word.endsWith("-")) return false;
        //no numbers
        int hyphens = 0;
        for(char c : word.toCharArray()) {
            if ((c-'0' < 9 && c-'0' > 0) || hyphens > 1) return false;
            //up to one hyphen
            if(c == '-')hyphens++;
        }
        return true;
    }

    public int validWords(String sentence) {
        int out = 0;
        String[] words = sentence.split("^ +$");
        for(String w : words) {
            if(isValid(w)) out++;
        }
        return out;
    }
}
