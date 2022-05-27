package com.revature.assignments.problem3;

public class Problem {
    public int reverseInt(int num) {
        boolean isNeg = num < 0;
        if (isNeg){
            num = num*-1; // make positive
        }
        int revInt = 0;
        int lastInt;

        while (num >=1) {
            lastInt = num % 10; //stripping off last digit
            revInt = revInt*10 + lastInt; // add lastInt to revInt
            num = num / 10; // strip off final digit to eventually end loop
        }
        
        if (isNeg) {
            return revInt*-1;
        }
        return revInt;
    }
}