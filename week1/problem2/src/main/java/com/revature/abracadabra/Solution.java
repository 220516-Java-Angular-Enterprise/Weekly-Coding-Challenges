package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
<<<<<<< HEAD

        List<String> anw = new ArrayList<>();

        for (int i =0; i < n; i++){
            if ((i+1)% 15== 0){
                anw.add("abracadabra");
            }
            else if((i+1)% 3 == 0){
                anw.add("abraca");
            }
            else if ((i+1) % 5 == 0){
                anw.add("dabra");
            }else{
                anw.add(Integer.toString(i+1));
            }
        }
    return anw;
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
