package com.revature.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        List<Integer> check = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i : check){
            if(check.contains(i*2)) return true;
        }
        Arrays.sort(arr);
         for(int i =arr.length-1; i>0; i--){
             if(arr[arr.length-1] == arr[i]*2)
                 return true;
         }
         return false;
    }
}
