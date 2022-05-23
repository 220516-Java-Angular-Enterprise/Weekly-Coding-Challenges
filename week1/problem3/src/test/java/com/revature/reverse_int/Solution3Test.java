package com.revature.reverse_int;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {
    Solution3 sol3 = new Solution3();

    @Test
    void reverseInt() {
        assertEquals(321, sol3.reverseInt(123));
        assertEquals(1, sol3.reverseInt(1));
        assertEquals(21, sol3.reverseInt(120));
        assertEquals(-321, sol3.reverseInt(-123));
        assertEquals(-21, sol3.reverseInt(-120));
    }
}