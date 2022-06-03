package com.revature.problem;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length-1; j++) {
                if(arr[i] == 2*arr[j]) {
                    System.out.println(arr[i]);
                    return true;
                }
                else {return false;}
            }
        }

        throw new RuntimeException("TODO! Needs implementation...");
    }
}
