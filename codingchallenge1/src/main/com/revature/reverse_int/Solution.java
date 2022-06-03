package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        int reverse = 0;
        int a;

        while(n != 0){
            a = n % 10;
            reverse = reverse * 10 + a;
            n = n/10;
        }
        return reverse;
    }
}