package com.revature.reverse_int;


public class Solution {

    public int reverseInt(int n) {
<<<<<<< HEAD
        //turn in to string
        // reverse string
        // turn backto int

        String num;
        String rev = "";
        int anw = 0;
        ;

        if (n < 0){
            rev = rev + "-";
            num = String.valueOf(n*-1);
        }else {
            num = String.valueOf(n);
        }

        //if  n  is negative

        rev = rev + reverseString(num);
        anw = Integer.parseInt(rev);

        return anw;
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

    private String reverseString(String s) {
        String reverse  = "";
        int l = s.length();

        for (int i = 0; i < l; i++){
            reverse = reverse + s.charAt(l-1- i);
        }
        return reverse;
    }

}
