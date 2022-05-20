package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        int reverse =0;
        while(n !=0){
            reverse = reverse * 10 + n%10;
            n/=10;
        }
        return reverse;
    }
}
