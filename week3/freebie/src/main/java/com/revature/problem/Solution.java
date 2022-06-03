package com.revature.problem;

public class Solution {
    public StringBuilder deleteAllNumbers(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                answer.append(charArray[i]);
            }
        }
        return answer;

    }
}