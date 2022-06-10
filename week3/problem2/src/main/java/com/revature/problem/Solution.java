package com.revature.problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean ifNDouleExist(int[] arr) {
        int zero=0;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for(int n: list){
            if (n==0) zero++;
            if (zero>1) return true;
            if (list.contains(n*2)&& n!=0) return true;
            }

            return false;


            }
        }
