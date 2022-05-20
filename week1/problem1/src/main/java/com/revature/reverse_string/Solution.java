package com.revature.reverse_string;
import java.lang.*;


public class Solution {
    public String reverseString(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).reverse();
        return builder.toString();
    }
}
