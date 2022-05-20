package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private String by3 = "abraca";
    private String by5 = "dabra";
    public List<String> abracadabra(int n) {
        List<String> out = new ArrayList<>(n);
        StringBuilder put;
        String elem;

        for (int i = 1; i <= n; i++) {
            put = new StringBuilder();
            if (i % 3 == 0) put.append(by3);
            if (i % 5 == 0) put.append(by5);
            elem = new String(put);
            out.add(i-1, elem.isEmpty() ? String.valueOf(i) : elem);
            put = null;
        }
        return out;
    }
}
