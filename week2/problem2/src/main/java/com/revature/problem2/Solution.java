package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    private void sort(String s, List<String> o) {
        if (o.isEmpty()) {
            o.add(s);
            return;
        }
        for(int i = 0; i < o.size(); i++) {
            if(s.compareTo(o.get(i)) < 0){
                o.add(i, s);
                return;
            }
        }
        o.add(s);

    }

    public List<String> autoComplete(List<String> list) {
        List<String> out  = new ArrayList<>();
        String query = list.get(0);

        for (String s : list.subList(1,list.size())) {
            if(s.matches(query+".*")) sort(s, out);
        }

        return out;
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
