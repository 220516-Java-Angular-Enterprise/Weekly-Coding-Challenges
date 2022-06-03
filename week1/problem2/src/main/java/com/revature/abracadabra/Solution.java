package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
<<<<<<< HEAD
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
=======
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) list.add("abracadabra");
            else if (i % 3 == 0) list.add("abraca");
            else if (i % 5 == 0) list.add("dabra");
            else list.add(String.valueOf(i));
        }

        return list;
>>>>>>> 850f03a (week2 coding challenge)
    }
}
