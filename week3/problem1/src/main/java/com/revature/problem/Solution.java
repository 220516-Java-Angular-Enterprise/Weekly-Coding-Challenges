package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int validWords(String sentence) {
        String[] s = sentence.split(" ");
        System.out.println(s.length);
        int numValid = 0;


        for (String w : s) {
            boolean punc = false;
            boolean hyp = false;
            invalidword:
            {
                if (w.length() == 0) break invalidword;
                if (w.endsWith("-") || w.startsWith("-")) break invalidword;
                //else if (w.startsWith("!") && w.length() == 0) numValid++;

                for (int j = 0; j < w.length(); j++) {
                    if(Character.isDigit(w.charAt(j))) break invalidword;

                    if (w.charAt(j) == '-' && hyp == true) break invalidword;
                    else if (w.charAt(j) == '-' && !Character.isLetter(w.charAt(j+1))) break invalidword;
                    else if (w.charAt(j) == '-' && hyp == false) hyp = true;

                    //More than one punctuation
                    boolean b1 = w.charAt(j) == '!' || w.charAt(j) == '.' || w.charAt(j) == ',';
                    if (b1 && punc) break invalidword;
                    else if (b1) punc = true;

                    //if punctuation is not at the end is not the last char
                    if (j != w.length() - 1 && b1) break invalidword;
                }
                System.out.println(w);
                numValid++;
            }
        }


        return numValid;
    }
}
