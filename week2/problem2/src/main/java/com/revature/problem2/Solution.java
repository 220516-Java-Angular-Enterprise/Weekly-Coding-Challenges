package com.revature.problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String>newList = new ArrayList<>();

        String str = list[0];
        char letter = str.charAt(0);

        for(int i = 0; i < word.length; i++){
            if(word[i]){
                newList.add(word[i]);
            }
        }
        return newList;
    }
}
