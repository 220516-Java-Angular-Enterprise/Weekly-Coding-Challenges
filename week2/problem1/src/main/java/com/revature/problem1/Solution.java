package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == k) {
                break;
            }
        }

        throw new RuntimeException("TODO! Needs implementation...");
    }


}