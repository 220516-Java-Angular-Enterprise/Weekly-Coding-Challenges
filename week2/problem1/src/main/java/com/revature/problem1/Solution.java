package com.revature.problem1;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);
        int smallest = 0;
        for (int j : arr) {
            if (j > k) {
                smallest = j;
                break;
            }
        }
        smallest += 1;
        return smallest;
    }
}