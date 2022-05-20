package com.revature.abracadabra;

import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
        String str1 = "abracadabra";
        String str2 = "abraca";
        String str3 = "dabra";

        if (n % 3 == 0 && n %5 ==0){
            System.out.println(str1);
        } else if ( n %3 ==0) {
            System.out.println(str2)

        } else if (n %5== 0) {
            System.out.println(str3)

        } else {
            System.out.println(n)
        }

        throw new RuntimeException("TODO! Needs implementation...");
    }
}
