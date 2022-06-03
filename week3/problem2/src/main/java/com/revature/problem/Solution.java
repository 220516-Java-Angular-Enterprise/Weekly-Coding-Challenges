package com.revature.problem;

import java.util.Arrays;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        Arrays.sort(arr);
         for(int i =arr.length-1; i>0; i--){
             if(arr[arr.length-1] == arr[i]*2)
                 return true;
         }
         return false;
    }
}
