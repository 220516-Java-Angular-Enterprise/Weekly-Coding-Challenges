package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int smallestNum = k + 1;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == smallestNum ) {
                elementNotInArray(arr, smallestNum++);
            }
        }

        return smallestNum;
    }

}
