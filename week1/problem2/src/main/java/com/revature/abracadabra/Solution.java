package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> abracadabra(int n) {

//        Create variables to hold info
//        int i = 0;
        String s = "";

//        create try catch for exception
        List<String> newArr = new ArrayList();
//        Create a for loop to compare given int with 0-given int and convert to array
        for (int i = 1; i <= n; i++) {
//            if i is less than n, add I to an array at the next index.

//            if (i < n) {

                if (i % 3 == 0) {
                    s = "abraca";
                    newArr.add(s);

                } else if (i % 5 == 0) {
                    s = "abraca";
                    newArr.add(s);

                } else if (i % 5 == 0 && i % 3 == 0) {
                    s = "abraca";
                    newArr.add(s);

                } else
                    s = String.valueOf(i);
                newArr.add(s);
            }


//        throw new RuntimeException("TODO! Needs implementation...");
//        }
        return newArr;
    }
}
