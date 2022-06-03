package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s) {

        StringBuilder sb = new StringBuilder();
        String noNum;
        char c;
        for (int i = 0; i <= s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                sb.append((i));
                i++;
            }
        }
        return noNum;

        throw new RuntimeException("TODO! Needs implementation...");
    }
}
