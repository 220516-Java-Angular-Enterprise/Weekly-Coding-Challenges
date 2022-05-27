package com.revature.problem1;

import java.util.Arrays;
public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (k < arr[i]) {
                if (k + 1 == arr[i]) {
                    k = arr[i];
                } else return k + 1;
            }
        }
        return k;
    }
}

