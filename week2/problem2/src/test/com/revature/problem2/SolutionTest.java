package com.revature.problem2;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution s = new Solution();

    public SolutionTest() {
    }

    @Test
    public void test1() {
        List<String> list = Arrays.asList("do", "dog", "cat", "bird", "donut", "cake", "dough");
        Assert.assertEquals(Arrays.asList("dog", "donut", "dough"), this.s.autoComplete(list));
    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("spo", "fork", "knife", "spoon", "spin", "spun", "spool", "spork", "bowl");
        Assert.assertEquals(Arrays.asList("spool", "spoon", "spork"), this.s.autoComplete(list));
    }

    @Test
    public void test3() {
        List<String> list = Arrays.asList("base", "ball", "bar", "baseball", "basement", "bathroom", "bedroom");
        Assert.assertEquals(Arrays.asList("baseball", "basement"), this.s.autoComplete(list));
    }
}