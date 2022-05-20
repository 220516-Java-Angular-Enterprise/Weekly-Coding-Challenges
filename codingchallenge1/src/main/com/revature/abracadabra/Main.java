package com.revature.abracadabra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int userNum;
        Solution sol = new Solution();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer");
        userNum = scan.nextInt();
        System.out.println(userNum);

        System.out.println(sol.abracadabra(userNum));

    }
}
