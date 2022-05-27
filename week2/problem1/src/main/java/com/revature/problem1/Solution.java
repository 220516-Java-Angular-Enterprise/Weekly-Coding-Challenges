package com.revature.problem1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        List<Integer> biggerNums = new ArrayList<>();
        int minBigNum = Integer.MAX_VALUE;
        for(int i:arr){
            if(i > k ){
                biggerNums.add(i);
            }
            }
        for(int i:biggerNums){
            if(minBigNum > i){
                minBigNum = i;
            }
        }
        return minBigNum+1;
        }

    }

