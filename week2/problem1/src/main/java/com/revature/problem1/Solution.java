package com.revature.problem1;
/*You are given an array having N elements and an integer K.

You have to write a program to find the smallest number greater than K which is not present in the given array.*/
public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        throw new RuntimeException("TODO! Needs implementation...");

        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i]) {
                System.out.println("Index:" + i + "Value:"+ arr[i]);
            }
        }
    }}
