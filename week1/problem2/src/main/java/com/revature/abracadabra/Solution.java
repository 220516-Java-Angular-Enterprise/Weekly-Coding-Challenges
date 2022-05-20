package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
        List<String> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String temp = "";
            if ((i % 3) == 0){
                temp = "abraca";
            }
            if ((i % 5) == 0){
                temp = temp + "dabra";
            }
            if(temp.isEmpty()){
                answer.add(String.valueOf(i));
            } else answer.add(temp);
        }
        return answer;
    }
}
