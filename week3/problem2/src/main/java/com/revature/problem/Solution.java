package com.revature.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {

        //loop through array
        //get current index
        //if there exist in the array a number that equals the current index * 2 or / 2 return true
        List<Integer> newList = new ArrayList<>();
        for (int j : arr) {
            newList.add(j);
        }
        for(int i = 0; i < arr.length; i++){
            int currInt = arr[i];
            if(newList.contains(currInt * 2) || newList.contains(currInt / 2)){
                return true;
            }
        }
        return true;
    }
}
