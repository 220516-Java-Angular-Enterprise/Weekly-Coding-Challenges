package com.revature.problem2;

import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        String str = "";
        String userInput = (new Scanner(System.in)).next();
        for (String string : s) {
            if (string.toLowerCase().contains(userInput.toLowerCase())
                str += string;
            return str;
        }
        throw new RuntimeException("TODO! Needs implementation...");
    }
}
