package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
<<<<<<< HEAD
        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(n)).reverse();

        for(int i = 0; i < builder.length(); i++){
            if(builder.indexOf("0") != -1){
                builder.deleteCharAt(builder.indexOf("0"));
            }
            if(builder.indexOf("-") != -1){
                builder.deleteCharAt(builder.indexOf("-"));
                builder.insert(0, "-");
            }
        }

        return Integer.parseInt(builder.toString());
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
