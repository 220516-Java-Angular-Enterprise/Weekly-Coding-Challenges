package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);
        for(int n : arr){
            if(k<n){
                if(n-k > 1) return k+=1;
                else k++;
            }
        }
        return k;
    }
}
