package com.revature.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        String str = "abc123def";
        assertEquals("abcdef", s.deleteAllNumbers(str));
    }

    @Test
    public void test2() {
        String str = "123";
        assertEquals("", s.deleteAllNumbers(str));
    }

    @Test
    public void test3() {
        String str = "1abc2";
        assertEquals("abc", s.deleteAllNumbers(str));
    }

    @Test
    public void test4() {
        String str = "";
        assertEquals("", s.deleteAllNumbers(str));
    }

    @Test
    public void test5() {
        String str = "!@#$123!@#$";
        assertEquals("!@#$!@#$", s.deleteAllNumbers(str));
    }
}