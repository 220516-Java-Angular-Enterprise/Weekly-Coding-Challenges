package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
//        need boolean to hold answer (and change as we go)
        boolean ans = true;
        int N = 0;
        int M = 0;
//        need to create a nested for loop to compare both arrays
        for (int i = 0; i < arr.length; i++) {
//            need to look at the first index and then compare it to all other numbers
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    N = arr[i];
                    M = arr[j];
                    ans = true;
                } else ans = false;
            }
        }
            return ans;
    }
}
