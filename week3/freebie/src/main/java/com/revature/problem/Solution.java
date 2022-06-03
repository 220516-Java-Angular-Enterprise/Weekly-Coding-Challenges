package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s) {
        StringBuilder sb = new StringBuilder();
        String[] ar = s.split("\\d+");
        for (String st: ar) {
            sb.append(st);
        }
        s = sb.toString();
        return s;
    }
    }
