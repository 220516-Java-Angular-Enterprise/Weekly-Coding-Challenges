package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
<<<<<<< HEAD
    List outList= new ArrayList<String>();
    for (int i=0; i<n;i++) {
        int listNum=i+1;
     if (listNum%3 == 0 && listNum%5 == 0) {
         outList.add(i,"abracadabra");
        } else if (listNum%3==0) {
         outList.add(i, "abraca");
     } else if (listNum%5 ==0) {
         outList.add(i, "dabra");
     } else outList.add(i, String.valueOf(listNum));

    }
    return outList;
=======
        List<String> list = new ArrayList<>();
        
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
