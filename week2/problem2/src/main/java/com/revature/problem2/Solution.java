package com.revature.problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {

        // iterate through list
        // go through each word if you are able to iterate trough the whole string you grabed append to list anw
        List<String> anw =  new ArrayList<>();
        for (int i = 0;i< list.size(); i++ ){
            for (int j = i+1; j< list.size(); j++){
                try{
                    if(list.get(i).equals(list.get(j).substring(0,list.get(i).length()))){
                        anw.add(list.get(j));
                    }
                } catch (Exception e){

                }
            }
        }
        return anw;
    }
}
