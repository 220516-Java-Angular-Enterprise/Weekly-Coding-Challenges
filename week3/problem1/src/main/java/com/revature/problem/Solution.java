package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        String[]starr=sentence.split("");//split String into separate words
        int valid=0;
        for (String s:starr){
            boolean t=true;
            int hyphen = 0;

            for (int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='a'&&c<='z'){
                    continue;
                } if (c==hyphen){
                    c=s.charAt('-');
                    hyphen++;
                }

            }

        }
    }
}
// throw new RuntimeException("TODO! Needs implementation...");