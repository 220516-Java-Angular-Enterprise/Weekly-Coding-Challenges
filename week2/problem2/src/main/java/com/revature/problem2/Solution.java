package com.revature.problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        String key = list.get(0);
        List<String> ans = new ArrayList<>();
        for(String s: list){
            if(s.contains(key)) ans.add(s);
        }
        return ans;
    }
}
