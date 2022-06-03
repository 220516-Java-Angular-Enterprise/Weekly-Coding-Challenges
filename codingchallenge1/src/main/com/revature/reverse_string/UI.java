package com.revature.reverse_string;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        String userInput;
        Solution sol = new Solution();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        userInput = scan.nextLine();
        System.out.println("Your string: " + userInput);

        System.out.println("Reversed String: " + sol.reverseString(userInput));

    }
}
