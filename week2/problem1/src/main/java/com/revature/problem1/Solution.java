package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        //Because we want the first value higher than k and not in the array, we "cheat"
        //set output initially to k+1, see if array contains it.
        boolean notFound=true;
        int outInt=k+1;
        while (notFound) {
            notFound=false;
            for (int i : arr) {
                if (i == outInt) {
                    outInt+=1;
                    notFound=true;
                }
            }
        }
    return outInt;
    }
}
