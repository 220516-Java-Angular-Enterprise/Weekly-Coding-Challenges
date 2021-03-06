package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        //Collections has a sort method.  Let's use that.
        List<String> sortedList = list.subList(1,list.size());
        Collections.sort(sortedList);
        //now we can use the input to search through the list.
        List<String> outList = new ArrayList<String>();
        String inStr = list.get(0);
        for (String s : sortedList){
            //Make sure we're not comparing to a string that's too long:
            //It took me half an hour to figure out that I put '>' instead of '<'

            if (s.length()>=inStr.length()) {
                //if the first inStr.length() chars in substring match, add to output

                if (s.substring(0, inStr.length()).contains(inStr)) {

                    outList.add(s);
                }
            }
        }

        return outList;
    }
}
