package com.revature.abracadabra;

public class Solution {
    public String abracadabra(int n) {
        String divThreeFive = "abracadabra";
        String divThree = "abraca";
        String divFive = "dabra";
        String[] stringArray = new String[n];
        String returnString = "";

        for (int i = 0; i > n; i++){
            System.out.println("I'm being iterated.");
            if (i%n == 3){
                stringArray[i] = divThree;
            } else if (i%n == 5){
                stringArray[i] = divFive;
            } else if (i%n == 3 && i%n ==5){
                stringArray[i] = divThreeFive;
            } else {
                stringArray[i] = i + "";

            }
        }
        System.out.println(returnString);
        return returnString;
    }
}
