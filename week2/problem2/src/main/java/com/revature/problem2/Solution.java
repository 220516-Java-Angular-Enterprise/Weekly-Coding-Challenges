package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        String compareTo = list.get(0);

        List<String> returnVals = new ArrayList<String>();

        for(String s : list){
            boolean same = false;

            if (s == compareTo){
                continue;
            }
            try{

                for(int i = 0; i < compareTo.length(); i++) {
                    if (compareTo.charAt(i) == s.charAt(i)) {
                        same = true;
                    }
                    else{
                        same = false;
                        break;
                    }
                }
            }catch(Exception e){
                same = false;
            }
            if (same){
                returnVals.add(s);
            }

        }

        Collections.sort(returnVals);

        return returnVals;

    }
}
