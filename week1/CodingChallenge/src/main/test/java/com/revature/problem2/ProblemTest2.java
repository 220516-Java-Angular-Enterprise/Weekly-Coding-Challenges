package com.revature.problem2;

import com.revature.assignments.problem2.Problem;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest2 {

    Problem sol = new Problem();
    @Test
    void newList() {
        assertEquals(Arrays.asList("1", "2", "abraca"), sol.newList(3));
        assertEquals(Arrays.asList("1", "2", "abraca", "4", "dabra"), sol.newList(5));
        assertEquals(Arrays.asList("1", "2", "abraca", "4", "dabra", "abraca", "7", "8", "abraca", "dabra", "11", "abraca", "13", "14", "abracadabra"), sol.newList(15));
        assertEquals(Arrays.asList(), sol.newList(0));
        assertEquals(Arrays.asList("1"), sol.newList(1));
    }
}
