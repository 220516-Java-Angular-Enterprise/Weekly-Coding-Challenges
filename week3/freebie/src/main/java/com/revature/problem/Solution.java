package com.revature.problem;




public class Solution {
    public String deleteAllNumbers(String s) {
        String result = "";
        char[] arr= s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (!Character.isDigit(arr[i])) {
                result = result + arr[i];


            }


        }
        return result;
    }
}