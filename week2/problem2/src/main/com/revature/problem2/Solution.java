package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> autocomplete = new ArrayList<>();
        for(int i =1; i<list.size(); i++){
            if(list.get(0).length()<=list.get(i).length()){
                if(list.get(0).equals(list.get(i).substring(0,list.get(0).length())))
                    autocomplete.add(list.get(i));
            }
        }
        Collections.sort(autocomplete);
        return autocomplete;
    }

}
