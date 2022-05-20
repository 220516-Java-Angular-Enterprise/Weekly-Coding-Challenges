package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        String rev = "";
        String nStr = Integer.toString(n);

        if (nStr.charAt(0) == '-') rev += '-';

        for (int i = nStr.length()-1; i >= 0; i--) {
            if (nStr.charAt(i) != '-') rev += nStr.charAt(i);
        }

        n = Integer.parseInt(rev);
        return n;
    }
}
