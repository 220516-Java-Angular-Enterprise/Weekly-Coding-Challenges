package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {

        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        return result;
    }

        //throw new RuntimeException("TODO! Needs implementation...");
    }

