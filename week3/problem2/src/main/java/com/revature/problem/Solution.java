package com.revature.problem;

import java.util.Arrays;

public class Solution {
    private boolean binarySearch(int index, int i, int[] arr) {
        int start = 0;
        int end = arr.length;
        int mid;
        do {
            mid = (start+end)/2;
            if(i < arr[mid]) end = mid;
            else if(i > arr[mid]) start = mid + 1;
            else return mid != index;
        }while (start != end);
        return false;
    }

    public boolean ifNDouleExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(binarySearch(i, 2*arr[i], arr)) return true;
        }
        return false;
    }
}
