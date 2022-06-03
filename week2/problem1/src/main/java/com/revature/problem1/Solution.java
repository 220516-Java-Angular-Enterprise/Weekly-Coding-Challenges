package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
<<<<<<< HEAD
        int maxNum = 0;
        int minNum = 0;
        int newMinNum = 0;
        int notInArray = 0;

        for (int x: arr){
            if (arr[x] >= maxNum){
                maxNum = arr[x];
            }else if (arr[x] <= maxNum){
                arr[x] = newMinNum;
                if(minNum >= newMinNum){
                    minNum= newMinNum;
                }
            }
        }
        for(int i = minNum; i < maxNum; i++){
            while(i<= k){
                continue;
            }
            if(i<maxNum && i>k){
                notInArray = i;
            }else return 0;
        }


return notInArray;
        //throw new RuntimeException("TODO! Needs implementation...");
=======
        throw new RuntimeException("TODO! Needs implementation...");
>>>>>>> 850f03a (week2 coding challenge)
    }
}
