package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {

        List<String> anw = new ArrayList<>();

        for (int i =0; i < n; i++){
            if ((i+1)% 15== 0){
                anw.add("abracadabra");
            }
            else if((i+1)% 3 == 0){
                anw.add("abraca");
            }
            else if ((i+1) % 5 == 0){
                anw.add("dabra");
            }else{
                anw.add(Integer.toString(i+1));
            }
        }
    return anw;
    }
}
