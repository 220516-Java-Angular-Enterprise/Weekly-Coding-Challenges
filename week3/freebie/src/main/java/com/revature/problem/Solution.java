package com.revature.problem;

import java.util.Arrays;

public class Solution {
    public String deleteAllNumbers(String s) {
        StringBuilder out = new StringBuilder();
        Arrays.stream(s.split("\\d")).forEach(out::append);
        return new String(out);
    }
}
