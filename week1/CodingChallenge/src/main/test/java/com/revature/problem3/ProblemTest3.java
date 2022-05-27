package com.revature.problem3;

import com.revature.assignments.problem3.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest3 {

    Problem sol = new Problem();

    @Test
    void reverseInt(){
        assertEquals(543, sol.reverseInt(345));
        assertEquals(-321, sol.reverseInt(-123));
        assertEquals(21, sol.reverseInt(120));
    }
}
