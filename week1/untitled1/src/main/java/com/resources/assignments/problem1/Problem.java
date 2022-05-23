package main.java.com.resources.assignments.problem1;

public class Problem {

    public StringBuilder reverseString(String s) {
        String reverse = "";
//        StringBuilder reverse = new StringBuilder();
//        reverse.append(s);
//        reverse.reverse();
        for (int i=s.length()-1; i>=0; i--) {
            reverse += (s.charAt(i));
        }

        return reverse;
    }
}
