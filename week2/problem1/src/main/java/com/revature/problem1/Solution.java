package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
//        sort the array
        Arrays.sort(arr);
//        create variables to store answer
        int ans = k + 1;

//        create a low and high variable to look at
        int low = 0;
        int high = arr.length - 1;
//        while loop to loop through array
        while (low <= high) {

//            find middle of low and high number
            int middle = (low + high) / 2;

            if (arr[middle] <= ans) {
                if (arr[middle] == ans) {
                    ans++;
                    high = arr.length - 1;
                }
//                already know ans is higher than middle element
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return ans;
    }
}
