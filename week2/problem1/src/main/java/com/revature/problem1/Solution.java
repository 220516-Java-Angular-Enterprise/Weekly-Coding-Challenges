package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int smallest=k+1;
        Arrays.sort(arr);
        for(int x: arr){
            if(x>k && x==smallest){
                smallest++;
            }
        }
        return smallest;

        //throw new RuntimeException("TODO! Needs implementation...");
    }
}
