package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        arr = new int[]{1, 4, 5, 2, 7};
        k = 4;
        int noE;
        int[] notContained = new int[];
        for (int n: arr) {
            if (n != arr[n] ) {
                notContained.add(n);
            }
        }
        return noE;

        //throw new RuntimeException("TODO! Needs implementation...");
    }
}
