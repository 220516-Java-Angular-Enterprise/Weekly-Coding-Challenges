package com.revature.problem;

public class Sol {
    private boolean isValid(String word) {
        char c;
        int hyphens = 0;
        int punctuation = 0;
        for(int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            //no numbers              up to one hyphen  only one punctuation
            if ((c >= '0' && c <= '9') || (hyphens > 1) || (punctuation > 1)) return false;
            switch(c) {
                case '-':
                    hyphens++;
                    //surrounded by letters
                    if(word.endsWith("-") || word.startsWith("-") ||
                            word.charAt(i-1)<'a' || word.charAt(i-1)>'z' ||
                            word.charAt(i+1)<'a' || word.charAt(i+1)>'z')
                        return false;
                    break;
                case '!':
                case '.':
                case ',':
                    punctuation++; //punctuation at the end
                    if(i != word.length()-1) return false;
            }
        }
        return !word.isEmpty();
    }

    public int validWords(String sentence) {
        int out = 0;
        String[] words = sentence.split(" +");
        for(String w : words) {
            if(isValid(w)) out++;
        }
        return out;
    }
}
