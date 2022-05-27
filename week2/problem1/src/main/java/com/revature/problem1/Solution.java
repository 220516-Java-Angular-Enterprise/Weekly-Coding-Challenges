package com.revature.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int number = k+1;


       for(int i = 0; i <arr.length; i++){
           if (arr[i] > number){
            if(arr[i] == number + 1){
                number = arr[i];
            }
           }
       }
       return number;
    }
}
