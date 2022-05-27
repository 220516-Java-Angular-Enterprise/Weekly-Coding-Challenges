package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> l = new ArrayList<>();
        String input = list.get(0);

        for (int i = 1; i < list.size(); i++ ) {
            for (int j = 0; j < input.length(); j++ ) {
                if (input.charAt(j) != list.get(i).charAt(j)) break;
                if (j == input.length() - 1) l.add(list.get(i));
            }
        }
        Collections.sort(l);


        return l;
    }
}
