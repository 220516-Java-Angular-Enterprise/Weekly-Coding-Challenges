package com.revature.reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution1 sol1 = new Solution1();

    @Test
    void reverseString() {
        assertEquals("olleH", sol1.reverseString("Hello"));
        assertEquals("!dlroW olleH", sol1.reverseString("Hello World!"));
        assertEquals("54321", sol1.reverseString("12345"));
        assertEquals("%$#@!", sol1.reverseString("!@#$%"));
        assertEquals("", sol1.reverseString(""));
        assertEquals(".", sol1.reverseString("."));
    }
}