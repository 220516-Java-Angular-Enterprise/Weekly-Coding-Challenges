package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        //    use split
//        int for return
        int ans = 0;
        String[] arr = sentence.split("  *");

//        if statement to take new string and loop through (for) to get rid of nums. Add to ans if meets requirements
        for (int i = 0; i < arr.length; i++) {
//            changes index to char array
            char[] look = arr[i].toCharArray();

            for(int j = 0; j < look.length; j++) {
//            if statement to see that char is NOT a digit (use ! for false)
//                PROBLEM: Adds for each index in array not total word
                if (Character.isDigit(look[j])) {
//                    not in scope...
                    boolean yes = false;
                }
                if (yes = true) {
                    ans = ans + 1;
                }

            }
        }
        return ans;
    }
}
