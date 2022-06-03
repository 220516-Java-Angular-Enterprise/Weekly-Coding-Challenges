package com.revature.problem;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        boolean ans = true;
        int count = 0;

        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j <arr.length; j++){
                if(arr[j] == (arr[i] * 2)){
                    count++;
                }
            }
            if(count > 0){
                ans = true;
            }
            else{
                ans = false;
            }
        }
        return ans;
    }
}
}
