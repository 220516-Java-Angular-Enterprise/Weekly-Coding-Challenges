package com.revature.problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String stringMap(List<String> bigstr) {
       String pre = bigstr.get(0);
       List<String> answer = new ArrayList<>();

       for(int i=0; i<bigstr.size(); i++) {
           if(bigstr.get(i).contains(pre)) {
               answer.add(bigstr.get(i));
           }
       }
       System.out.println(answer);
        return " ";
    }

}
