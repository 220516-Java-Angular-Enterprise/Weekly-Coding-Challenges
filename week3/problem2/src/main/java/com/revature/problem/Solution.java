package com.revature.problem;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        boolean sol = false;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int d = arr[i] * 2;
            for ( int j = i+1; j < arr.length; j++) {
                if ( arr[j] == d) {
                    sol = true;
                    break;
                }
            }
        }

        return sol;
    }
}
