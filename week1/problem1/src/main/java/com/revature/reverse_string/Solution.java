package com.revature.reverse_string;

import java.util.ArrayList;

public class Solution {
    public String reverseString(String s) {



        //https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/

        if (false) {
            StringBuilder str = new StringBuilder(s);
            str = str.reverse();

            return str.toString();
        }


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

        return myString.toString();



    }
}
