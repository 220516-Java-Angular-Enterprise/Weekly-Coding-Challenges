package main.java.com.resources.assignments.problem1;

public class Problem {

    public StringBuilder reverseString(String s) {
        StringBuilder reverse = new StringBuilder();

        reverse.append(s);
        reverse.reverse();

        return reverse;
    }
}