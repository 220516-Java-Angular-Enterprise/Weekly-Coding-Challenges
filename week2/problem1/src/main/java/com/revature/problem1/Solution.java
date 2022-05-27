package com.revature.problem1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);

        int returnNumber = k + 1;
        //System.out.println("K: " + k + " return: " + returnNumber);
        boolean numberFound = false;

        for(int i = 0; i < arr.length; i++){
            if (Array.getInt(arr, i) <= k)
                continue;
            else if (Array.getInt(arr, i) > k &&
                    Array.getInt(arr, i) == returnNumber) {
                //System.out.println("Array Val: " + Array.getInt(arr, i) + " Returnbefore: " + returnNumber);
                returnNumber += 1;
            }
            else{
                numberFound = true;
                break;
            }
        }
        if (numberFound == false)
            k += 1;

        return returnNumber;

    }
}
