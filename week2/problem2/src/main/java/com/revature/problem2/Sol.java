package com.revature.problem2;

import java.util.ArrayList;
import java.util.List;

public class Sol {
    private void binarySort(String s, List<String> o) {
        //complete overkill, since the outputs are only like 2 long
        int start = 0;
        int end = o.size();
        int mid = o.size() / 2;
        while (start != end) {
            if(s.equals(o.get(mid))) {
                break;
            }
            else if(s.compareTo(o.get(mid)) < 0) {
                end = mid;
            }
            else if(s.compareTo(o.get(mid)) > 0) {
                start = mid+1;
            }
            mid = (start + end) / 2;
        }
        o.add(mid, s);

    }

    public List<String> autoComplete(List<String> list) {
        List<String> out  = new ArrayList<>();
        String query = list.get(0);

        for (String s : list.subList(1,list.size())) {
            if(s.matches(query+".*")) binarySort(s, out);
        }

        return out;
    }
}
