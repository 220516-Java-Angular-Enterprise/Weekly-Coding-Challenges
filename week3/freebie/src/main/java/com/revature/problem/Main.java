package com.revature.problem;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter a string of letters and numbers");
        String str = scan.nextLine();

        System.out.println("New string: " + sol.deleteAllNumbers(str));

    }
}
