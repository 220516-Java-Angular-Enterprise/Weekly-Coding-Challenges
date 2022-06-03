package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int validWords(String sentence) {

        char[] arr = sentence.toCharArray();


        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {

                return false;
            }


        }

    }
}
