package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
<<<<<<< HEAD
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
=======
        int reverse = 0;
        boolean neg = false;

        if (n < 0) {
            n *= -1;
            neg = true;
        }

        while (n != 0) {
            int ln = n % 10;
            reverse = (reverse * 10) + ln;
            n /= 10;
        }

        if (neg) reverse *= -1;

        return reverse;
>>>>>>> 3ba7d5c2ea2b9e3c28c414da627d577390bc82ef
    }
}
