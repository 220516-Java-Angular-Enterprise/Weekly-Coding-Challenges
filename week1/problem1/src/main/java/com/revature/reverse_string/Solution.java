package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {

        char[] try1 = s.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
        return "";
    }

        // throw new RuntimeException("TODO! Needs implementation...");

    }

