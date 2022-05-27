package com.revature.problem1;

import java.util.Arrays;

public class Sol {

    private void join(int[][] ab, int[] out) {
        int a_i = 0;
        int b_i = 0;
        int index = 0;
        while (a_i < ab[0].length && b_i < ab[1].length) {
            out[index++] = ab[0][a_i] < ab[1][b_i] ?
                    ab[0][a_i++] : ab[1][b_i++];
        }
        if(a_i == ab[0].length) {
            while(b_i < ab[1].length) out[index++] = ab[1][b_i++];
        }
        if(b_i == ab[1].length) {
            while(a_i < ab[0].length) out[index++] = ab[0][a_i++];
        }
    }
    private int[][] split(int[] a) {
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        if(left.length > 1 || right.length > 1) {
            join(split(left), left);
            join(split(right), right);
        }

        return new int[][]{left, right};
    }

    private void mergeSort(int[] arr) {
        join(split(arr), arr);
    }

    public int elementNotInArray(int[] arr, int k) {
        int min = k+1;
        mergeSort(arr);
        //Arrays.sort(arr);
        for(int a : arr) if(min == a) min++;
        return min;
    }
}
