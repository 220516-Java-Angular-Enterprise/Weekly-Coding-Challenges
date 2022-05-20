package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        StringBuilder out = new StringBuilder();
        String s = String.valueOf(n);
        boolean negative = false;
        if (n < 0) {
            out.append('-');
            negative = true;
        }
        out.append(new com.revature.reverse_string.Solution().reverseString(
                negative ? s.substring(1) : s
        ));

        return Integer.parseInt(new String(out));
    }

    public int trueReverseInt(int n) {
        boolean negative = false;
        int lastNum;
        int out = 0;
        if (n < 0) {
            n *= -1;
            negative = true;
        }
        while (n > 0) {
            //get the ones place
            lastNum = n % 10;
            //left shift the result and place ones place there
            out = out * 10 + lastNum;
            //right shift n
            n /= 10;
        }
        if (negative) out *= -1;
        return out;
    }
}
