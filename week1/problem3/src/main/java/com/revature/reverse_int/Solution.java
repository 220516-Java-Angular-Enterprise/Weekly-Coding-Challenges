package com.revature.reverse_int;


public class Solution {

    public int reverseInt(int n) {
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
