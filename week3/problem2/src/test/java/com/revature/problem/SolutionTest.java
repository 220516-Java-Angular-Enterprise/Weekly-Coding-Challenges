package com.revature.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        int[] arr = {10, 2, 5, 3};
        assertTrue(s.ifNDouleExist(arr));
    }

    @Test
    public void test2() {
        int[] arr = {7, 1, 14, 11};
        assertTrue(s.ifNDouleExist(arr));
    }

    @Test
    public void test3() {
        int[] arr = {3, 1, 7, 11};
        assertFalse(s.ifNDouleExist(arr));
    }

    @Test
    public void test4() {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        assertFalse(s.ifNDouleExist(arr));
    }

    @Test
    public void test5() {
        int[] arr = {0, 0};
        assertTrue(s.ifNDouleExist(arr));
    }
}