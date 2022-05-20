package com.revature.reverse_int;

import java.util.ArrayList;

public class Solution {
    public int reverseInt(int n) {

        boolean negativeNum = false;

        if (n < 0){
            n *= -1;
            negativeNum = true;
        }

        String s = Integer.toString(n);
        ArrayList<Character> newString = new ArrayList<Character>();
        for
        ( int i = s.length() - 1 ;
          i >= 0 ;
          i-- ) {
            newString.add(s.charAt(i));
        }

        StringBuilder myString = new StringBuilder();
        for(char c : newString){
            myString.append(c);
        }

        //System.out.println(myString.toString());


        int returnVal = Integer.parseInt(myString.toString());
        if (negativeNum)
            returnVal *= -1;
        return returnVal;

        //return myString.toString();


    }
}
