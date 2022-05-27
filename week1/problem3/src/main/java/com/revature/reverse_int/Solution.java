package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
<<<<<<< HEAD
        int temp=0,nextdigit=0, current=0;
        while(n!=0){
            temp=n%10;
            nextdigit=nextdigit*10+temp;
            n=n/10;


        }
        return nextdigit;
        //throw new RuntimeException("TODO! Needs implementation...");
=======
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
>>>>>>> 3ba7d5c2ea2b9e3c28c414da627d577390bc82ef
    }

}
