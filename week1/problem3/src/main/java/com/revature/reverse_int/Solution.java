package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        StringBuilder reverse = new StringBuilder();
        String s = String.valueOf(n);
        for(int i = s.length()-1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        s = reverse.toString();
        //s.replace("^0","");
        if(s.contains("-")){
            s = s.replace("-", "");
            n = Integer.valueOf(s) * -1;
        } else {
            n = Integer.valueOf(s);
        }
        System.out.println(n);
        return n;
    }
}
