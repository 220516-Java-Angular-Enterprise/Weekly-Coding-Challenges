package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String deleteAllNumbers(String s) {
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                newString.append(s.charAt(i));
            }
        }
        return newString.toString();
    }
}
