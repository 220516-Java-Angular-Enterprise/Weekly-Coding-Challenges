package com.revature.problem1;

import com.revature.assignments.problem1.Problem;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest1 {
    Problem sol = new Problem();
    @Test
    void reverseString() {
        assertEquals("olleH", sol.reverseString("Hello"));
        assertEquals("!dlroW olleH", sol.reverseString("Hello World!"));
        assertEquals("54321", sol.reverseString("12345"));
        assertEquals("%$#@!", sol.reverseString("!@#$%"));
        assertEquals("", sol.reverseString(""));
        assertEquals(".", sol.reverseString("."));
    }
}
