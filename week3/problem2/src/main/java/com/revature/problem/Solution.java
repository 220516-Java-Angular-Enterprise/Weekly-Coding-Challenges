package com.revature.problem;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int out1 = arr[i];
            for (int j = i+1; j < arr.length; j++){
                int out2 = arr[j];
                if(out1 == (out2 * 2) || out2 == (out1 * 2)){
                    return true;
                }
            }
        }
        return false;
    }
}
