package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        int temp=0,nextdigit=0, current=0;
        while(n!=0){
            temp=n%10;
            nextdigit=nextdigit*10+temp;
            n=n/10;


        }
        return nextdigit;
        //throw new RuntimeException("TODO! Needs implementation...");
    }

}
