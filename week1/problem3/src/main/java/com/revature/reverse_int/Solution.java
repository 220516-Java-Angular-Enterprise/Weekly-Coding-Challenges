package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
        String inStr=String.valueOf(n);
        //check if number is negative
        if (n<0) {
            String outStr = inStr.substring(1);
            outStr = "-" + this.reverseString(outStr);
            return Integer.valueOf(outStr);
        } else {
            return Integer.valueOf(this.reverseString(inStr));
        }

    }

    //A more elegant solution would be to import this from the first problem...
    public String reverseString(String s) {
        String outString="";
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(s.length()-1-i);
            outString = outString.concat(Character.toString(c));
        }
        return outString;
    }
}
