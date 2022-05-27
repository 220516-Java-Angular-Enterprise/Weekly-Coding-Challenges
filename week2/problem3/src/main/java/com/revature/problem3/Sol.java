package com.revature.problem3;

import java.util.*;

public class Sol {
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
    public String wordCount(String sentence) {
        StringBuilder out = new StringBuilder();
        Map<String, Integer> count = new LinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" +");
        for(String w : words) {
            if(w.equals("")) continue;
            try {
                count.put(w, count.get(w) + 1);
            }
            catch(NullPointerException n) {
                count.put(w,1);
            }
        }
        List<String> outList = new ArrayList<>();
        for(String s : count.keySet()) {
            if(count.get(s) >1) sort(s, outList);
        }
        for(String s : outList) {
            out.append(s+": "+count.get(s)+"\n");
        }
        out.deleteCharAt(out.lastIndexOf("\n"));

        return new String(out);
    }
}
