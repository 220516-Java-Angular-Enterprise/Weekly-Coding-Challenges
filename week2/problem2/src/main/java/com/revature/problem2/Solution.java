package com.revature.problem2;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Collection;
import java.util.Collections;
>>>>>>> eaf99ebc6aa7ac397911d8f249134f163ab648f9
import java.util.List;

public class Solution {
    private void sort(String s, List<String> o) {
        if (o.isEmpty()) {
            o.add(s);
            return;
        }
        for(int i = 0; i < o.size(); i++) {
            if(s.compareTo(o.get(i)) < 0){
                o.add(i, s);
                return;
            }
        }
        o.add(s);

    }

    public List<String> autoComplete(List<String> list) {
        List<String> out  = new ArrayList<>();
        String query = list.get(0);

        for (String s : list.subList(1,list.size())) {
            if(s.matches(query+".*")) sort(s, out);
        }

        return out;
    }
}
