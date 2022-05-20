package com.revature.reverse_int;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt();
        System.out.println(i+" Changes to\n"+
                new Solution().reverseInt(i));
    }
}
