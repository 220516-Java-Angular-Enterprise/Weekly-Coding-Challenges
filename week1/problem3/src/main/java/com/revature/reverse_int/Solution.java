package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
<<<<<<< HEAD

        int reverse = 0;
        boolean neg = false;
=======
        int reverse = 0;
        boolean neg = false;

>>>>>>> 2e05c3b824bf216d17031eae2146fb2d3e30ccb1
        if (n < 0) {
            n *= -1;
            neg = true;
        }

<<<<<<< HEAD
        while (n > 0 ) {
=======
        while (n != 0) {
>>>>>>> 2e05c3b824bf216d17031eae2146fb2d3e30ccb1
            int ln = n % 10;
            reverse = (reverse * 10) + ln;
            n /= 10;
        }

        if (neg) reverse *= -1;

        return reverse;
    }


    }

