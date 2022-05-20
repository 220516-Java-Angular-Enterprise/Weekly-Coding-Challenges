package com.revature.reverse_int;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userNum = scan.nextInt();

        System.out.println("Initial integer: " + userNum);
        System.out.println("Reversed number is: " + sol.reverseInt(userNum));
    }
}
