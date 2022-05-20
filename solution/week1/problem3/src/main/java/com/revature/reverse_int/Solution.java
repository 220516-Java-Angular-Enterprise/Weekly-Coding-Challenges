package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        if (n == 0) {
            return 0;
        }
       String reverseInt = "";
       String tempString = String.valueOf(n);

        if (n < 0){
            reverseInt += "-";
        }
       for (int i = tempString.length()-1; i >= 0; i--){
           reverseInt += tempString.charAt(i);
       }

    return Integer.parseInt(reverseInt);
    }
}
