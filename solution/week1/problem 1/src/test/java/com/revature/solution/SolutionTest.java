package com.revature.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sol = new Solution();

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