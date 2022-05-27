package com.revature.abracadabra;

<<<<<<< HEAD
import java.util.*;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 3ba7d5c2ea2b9e3c28c414da627d577390bc82ef

public class Solution {
    List<String> myList = new ArrayList<>();
    public List<String> abracadabra(int n) {
<<<<<<< HEAD
        if(n % 3 == 0){
            for(int i = 1; i <= n; i++){
                if(n == i){
                    myList.add("abraca");
                    break;
                }
                myList.add(String.valueOf(i));
            }
        }
        return myList;
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
