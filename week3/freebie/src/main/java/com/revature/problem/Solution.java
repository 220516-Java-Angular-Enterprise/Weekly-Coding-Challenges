package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String deleteAllNumbers(String s) {
        StringBuilder newString = new StringBuilder();
        List<Character> charArray = new ArrayList<>();

        for(char a:s.toCharArray()){ //Add non numbers to new array
            if(!Character.isDigit(a)){
                charArray.add(a);
            }
        }
        for(char a:charArray){ // Loop through character array to add to new String
            newString.append(a);
        }
        return newString.toString();
    }
}
