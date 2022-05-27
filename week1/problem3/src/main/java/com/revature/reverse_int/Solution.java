package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        int reverse = 0;
        boolean neg = false;

        if (n < 0) {
            n *= -1;
            neg = true;
        }

        while (n != 0) {
            int ln = n % 10;
            reverse = (reverse * 10) + ln;
            n /= 10;
        }

        if (neg) reverse *= -1;

        return reverse;
    }
}
