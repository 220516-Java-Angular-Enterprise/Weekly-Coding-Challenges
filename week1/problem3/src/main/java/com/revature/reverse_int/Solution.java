package com.revature.reverse_int;

import com.revature.reverse_string.*;

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
                negative ? s.substring(1, s.length()) : s
        ));

        return Integer.parseInt(new String(out));
    }
}
