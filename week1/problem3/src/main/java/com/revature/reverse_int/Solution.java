package com.revature.reverse_int;

public class Solution {
    public int reverseInt(int n) {
<<<<<<< HEAD
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
