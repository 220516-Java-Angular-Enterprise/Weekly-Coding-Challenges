package com.revature.abracadabra;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
    List outList= new ArrayList<String>();
    for (int i=0; i<n;i++) {
        int listNum=i+1;
     if (listNum%3 == 0 && listNum%5 == 0) {
         outList.add(i,"abracadabra");
        } else if (listNum%3==0) {
         outList.add(i, "abraca");
     } else if (listNum%5 ==0) {
         outList.add(i, "dabra");
     } else outList.add(i, String.valueOf(listNum));

    }
    return outList;
    }
}
