package com.revature.reverse_string;

public class Solution {
    public String reverseString(String s) {
        StringBuilder sReverse = new StringBuilder(s);
        sReverse.reverse();
        return sReverse.toString();

    }
}
