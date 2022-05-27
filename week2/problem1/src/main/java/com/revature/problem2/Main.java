package com.revature.problem2;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        List list = (List) Arrays.asList("do", "dog", "cat", "bird", "donut", "cake", "dough");
        sol.stringMap((java.util.List<String>) list);
    }
}
