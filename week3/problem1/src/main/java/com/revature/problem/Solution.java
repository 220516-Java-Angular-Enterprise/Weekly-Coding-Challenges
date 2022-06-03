package com.revature.problem;





//Mostly complete...
//test 5 is off by 2
//test 6 is off by 3...
//Potentially tests are incorrect. It will take too long to manually check. with time allotted.


public class Solution {
    public int validWords(String sentence) {

        int validWords = 0;

        String[] words = sentence.split(" ");

        for(String s : words){
            System.out.println(s);
            if (s.equals(" ") || s.equals(""))
                continue;

            if (s.contains("0") ||
                    s.contains("1") ||
                    s.contains("2") ||
                    s.contains("3") ||
                    s.contains("4") ||
                    s.contains("5") ||
                    s.contains("6") ||
                    s.contains("7") ||
                    s.contains("8") ||
                    s.contains("9") )
                continue;

            if (s.charAt(0) != '-' &&
            (s.charAt(0) != '!') &&
            (s.charAt(0) != '.') &&
            (s.charAt(0) != ',')
            ){
                if (s.length() > 1){
                    if (s.charAt(s.length() - 1) != '-'){
                        validWords += 1;
                        continue;
                    }
                    else
                        continue;
                }
                else {
                    validWords += 1;
                    continue;
                }

            }
            else if (s.length() == 1 &&
                    (s.charAt(0) != '!') &&
                    (s.charAt(0) != '.') &&
                    (s.charAt(0) != ',')
            ) {
                validWords += 1;
                continue;
            }
            else{
                continue;
            }
        }

        return validWords;


    }
}
