package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public Solution() {
    }

    public List<String> autoComplete(List<String> list) {
        String word = (String)list.get(0);
        List<String> possible = new ArrayList();

        for(int i = 1; i < list.size(); ++i) {
            if (((String)list.get(i)).contains(word)) {
                possible.add((String)list.get(i));
            }
        }

        Collections.sort(possible);
        return possible;
    }
}