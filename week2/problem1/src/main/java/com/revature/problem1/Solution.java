package com.revature.problem1;

public class Solution {
    private void mergerHelper(int[] a, int start, int end, int[] o) {

    }

    private int[] mergeSort(int[] arr) {
        int[] out = arr.clone();
        int mid = arr.length / 2;
        mergerHelper(arr, 0, mid, out);
        mergerHelper(arr, mid+1, arr.length-1, out);

        return out;
    }

    public int elementNotInArray(int[] arr, int k) {
        int min = k++;
        int[] sorted = mergeSort(arr);
        for(int a : sorted) if(min == a) min++;
        return min;
    }
}
