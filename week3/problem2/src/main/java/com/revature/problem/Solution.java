package com.revature.problem;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        boolean exists = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if( i != j && arr[i] == 2 *arr[j]){
                    exists = true;
                }
            }
        }
        return exists;
    }
}
