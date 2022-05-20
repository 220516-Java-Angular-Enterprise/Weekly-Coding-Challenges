package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        char temp;

        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length / 2; i++) {
            temp = sArr[i];
            sArr[i] = sArr[sArr.length-1 - i];
            sArr[sArr.length-1 - i] = temp;
        }
        return new String(sArr);
    }
}
