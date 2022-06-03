package com.revature.problem;

public class Solution {
    public String deleteAllNumbers(String s) {
//      String to return
        String ans = "";
//        convert s to char array to see if digit or char
        char[] arr = s.toCharArray();

//        for loop to delete digits
        for(int i = 0; i < arr.length; i++) {
//            if statement to see that char is NOT a digit (use ! for false)
            if (!Character.isDigit(arr[i])) {
                ans = ans + arr[i];
            }
        }
        return ans;
    }
}
