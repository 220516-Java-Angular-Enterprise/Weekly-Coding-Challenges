package main.com.revature.abracadabra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
       List<String> returnee= new LinkedList<>();
        String adding="";
       for(int i=1;i<=n;i++) {
       adding="";

           if (i%3 == 0){
              adding=adding+"abraca";
           }
           if(i%5==0){
               adding=adding+"dabra";
           }
           if(i%3!=0 || i%5!=0){
               adding=Integer.toString(i);
           }
           returnee.add(adding);
       }
       return returnee;

        //throw new RuntimeException("TODO! Needs implementation...");
    }
}
