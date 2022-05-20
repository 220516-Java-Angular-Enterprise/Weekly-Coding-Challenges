package com.revature.reverse_string;

import java.util.Scanner;


public class Solution {
    public String reverseString(String s) {

//        create variables for containing a char for each loop and a place to hold the new string
        char chara;
        String newS= "";

//        Try catch for exceptions
        try {

//        create for loop to go through string and by char
            for (int i = 0; i < s.length(); i++) {
                chara = s.charAt(i);
                newS = chara + newS;
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        return newS;
    }
}
