package com.revature.abracadabra;

import java.util.*;

public class Solution {
    List<String> myList = new ArrayList<>();
    public List<String> abracadabra(int n) {
        if(n % 3 == 0){
            for(int i = 1; i <= n; i++){
                if(n == i){
                    myList.add("abraca");
                    break;
                }
                myList.add(String.valueOf(i));
            }
        }
        return myList;
    }
}
