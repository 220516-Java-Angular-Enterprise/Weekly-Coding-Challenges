package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int smallestElement = k + 1;

        for(int i = 0; i < arr.length; ++i) {
            if (smallestElement == arr[i]) {
                ++smallestElement;
            }
        }

        return smallestElement;
    }
}
