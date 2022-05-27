package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
        List<String> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (n % 3 == 0 && n % 5 == 0) {
                aList.add("abracadabra");
            } else if (n % 5 == 0) {
                aList.add("dabra");
            } else if (n % 3 == 0) {
                aList.add("abraca");
            } else {
                aList.add(String.valueOf(n));
            }
        }
        return aList;
    }
}
