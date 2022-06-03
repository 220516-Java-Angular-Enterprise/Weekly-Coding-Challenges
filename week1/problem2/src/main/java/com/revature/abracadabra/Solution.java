package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
<<<<<<< HEAD


        List<String> list = new ArrayList<>();
=======
        List<String> list = new ArrayList<>();
        
>>>>>>> 2e05c3b824bf216d17031eae2146fb2d3e30ccb1
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) list.add("abracadabra");
            else if (i % 3 == 0) list.add("abraca");
            else if (i % 5 == 0) list.add("dabra");
            else list.add(String.valueOf(i));
<<<<<<< HEAD

        }
=======
        }

>>>>>>> 2e05c3b824bf216d17031eae2146fb2d3e30ccb1
        return list;
    }
}






