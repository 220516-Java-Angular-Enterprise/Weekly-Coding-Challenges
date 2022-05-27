package com.revature.problem1;

import sun.security.util.ArrayUtil;

import java.util.*;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        // sort array
        // reverse array
        // iterate trhough array
        // if i in > k go more
        // if smaller thank k i+1
        List<Integer> l = new ArrayList<>();

        for (int i: arr){
            l.add(i);
        }

        Collections.sort(l);
        Collections.reverse(l);

        for(int i= 0; i < l.size() - 1; i++){
            if (l.get(i) <= k){
                int temp = k;
                int tempIndex = i;
                while(temp+1 == l.get(tempIndex- 1) && tempIndex > 0){
                    temp++;
                    tempIndex--;
                }
                return temp +1;
            }
        }
    return k+1;
    }
}
