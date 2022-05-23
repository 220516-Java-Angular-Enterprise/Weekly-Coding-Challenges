package com.revature.reverse_int;

public class Solution3 {
    public int reverseInt(int n) {
        int reverse =0; // need integer to append the last digit
        boolean neg = false;
        // need to convert negative number to positive first otherwise it will throw an error
        if (n < 0) {
            n *= -1;
            neg = true;
        }
        while (n>0){
           int ln = n%10; //n%10 gives the last digit
            reverse=(reverse*10)+ln ;//example given as n = 123 and 3*10=30 30 +2=32
            n/=10; //deleting the last number

        }
        if(neg) reverse *=-1;
        return reverse;
    }
}