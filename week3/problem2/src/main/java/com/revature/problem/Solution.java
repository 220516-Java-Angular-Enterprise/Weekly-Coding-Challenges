package com.revature.problem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {

        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1; j > -1; j--) {
                if (arr[j] < arr[i] || j == i){
                    break;
                }
                if (arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
