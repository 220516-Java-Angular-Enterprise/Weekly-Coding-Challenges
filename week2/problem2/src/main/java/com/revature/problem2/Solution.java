package com.revature.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {


    public List<String> autoComplete(List<String> list) {
        List<String> myList = new ArrayList<String>();
        String start=list.get(0);
        int length = list.get(0).length();
        for (int i=1;i<list.size();i++) {
            String test = "";
            for (int j = 0; j < length; j++){
                if(length>list.get(i).length()){
                    break;
                }
               test=test+list.get(i).charAt(j);
            }
            if(test.equals(start)){
                myList.add(list.get(i));
            }

                //throw new RuntimeException("TODO! Needs implementation...");
        }
        Collections.sort(myList);
        return myList;
    }
}
