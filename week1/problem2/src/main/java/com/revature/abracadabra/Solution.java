package com.revature.abracadabra;

import java.util.*;


/*

if i is divisilbe by 3 & 5 then add abracadra to the list
if i is only divisile by 3 add abraca to the list
if i is divisible by 5 then cabra

*/
public class Solution {
    public List<String> abracadabra(int n) {

        ArrayList<String> returnValue = new ArrayList<String>();

        //"dabra", "abraca"
        for (int i = 1; i <= n; i++){
            if (i % 5 ==0){
                if (i % 3 == 0){
                    returnValue.add("abracadabra");
                }
                else{
                    returnValue.add("dabra");
                }
            }
            else if (i % 3 == 0){
                returnValue.add("abraca");
            }
            else{
                returnValue.add( Integer.toString(i) );
            }


        }

        //System.out.println(returnValue.toString());

        return returnValue;


        //throw new RuntimeException("TODO! Needs implementation...");
    }
}
