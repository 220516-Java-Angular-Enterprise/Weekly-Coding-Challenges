package com.revature.problem;

public class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] arr1 = {10, 3, 4, 22, 20, 55};
            int[] arr2 = {10, 3, 4, 22, 55, 29};

            System.out.println("Array 1: " + sol.ifNDouleExist(arr1));
            System.out.println("Array 2: " + sol.ifNDouleExist(arr2));
        }

    }

