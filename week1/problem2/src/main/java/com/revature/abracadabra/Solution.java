package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
        List<String> list = new ArrayList<>();
<<<<<<< HEAD
        int i;
        for (i=1; i<=n; i++ ) {

            if (i % 3 ==0  && i% 5 ==0) {
//                System.out.println("abracadabra");
                list.add("abracadabra");
            }
            else if (i % 3 ==0) {
                list.add("abraca");
            }
            else if (i % 5 ==0) {
                list.add("dabra");
            }
            else {
                list.add(String.valueOf(i));
            }
        }

        throw new RuntimeException("TODO! Needs implementation...");
=======
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) list.add("abracadabra");
            else if (i % 3 == 0) list.add("abraca");
            else if (i % 5 == 0) list.add("dabra");
            else list.add(String.valueOf(i));
        }

        return list;
>>>>>>> 3ba7d5c2ea2b9e3c28c414da627d577390bc82ef
    }
}
