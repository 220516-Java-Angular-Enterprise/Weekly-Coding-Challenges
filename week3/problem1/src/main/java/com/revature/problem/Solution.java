package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        int valid = 0;
        boolean digit = false;
        boolean goodHyphen = false;
        boolean onlyAlpha = false;
        String[] splitSentence = sentence.split(" ", 0);
        for(String s : splitSentence){
            if(s.equals(""))continue;
            if(s.indexOf('!') == 0 || s.indexOf('.') == 0 || s.indexOf(',') == 0) continue;

            for(int i =0; i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    digit = true;
                    break;

                }
            }
            if(digit) continue;

            if(s.indexOf('!') == s.length()-1 || s.indexOf('.') == s.length()-1 || s.indexOf(',') == s.length()-1){
                if(Character.isAlphabetic(s.indexOf('!')-1)|| Character.isAlphabetic(s.indexOf('.')-1) || Character.isAlphabetic(s.indexOf(',')-1))
                    valid++;
            }

            for(int i =0; i<s.length();i++){
                if(Character.isAlphabetic(s.charAt(i))){
                    onlyAlpha = true;
                }else {onlyAlpha=false; break;}
            }
            if(onlyAlpha){
                valid++;
                continue;
            }
            for(int i =0; i<s.length();i++){
                if(s.charAt(i) == '-'){
                    if(i == s.length()-1 || i==0) {
                        goodHyphen = false;
                        break;
                    }else if(Character.isAlphabetic(s.charAt(i-1)) && Character.isAlphabetic(s.charAt(i+1)))
                        goodHyphen = true;
                }
            }
            if(goodHyphen) {valid++;}





        }
        return valid;
    }
}
