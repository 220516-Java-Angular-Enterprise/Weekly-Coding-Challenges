package com.revature.reverse_string;

public class Main {
    public static void main(String[] args) {
        String testStr= "foo";
        System.out.println(testStr.substring(1, 3));
        System.out.println(testStr.substring(1,3).matches("(\\w)\\1+"));
    }
}
