package com.terminator.concepts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class _RecusionTest {

    private _Recusion recusionInstance;

    @Before
    public void setUp() {
        recusionInstance = new _Recusion();
    }

    @Test
    public void testFactorial_head_recursion_should_succeed() {
        assertEquals(recusionInstance.factorial(5), 120);
    }

    @Test
    public void testFactorial_tail_recursion_should_succeed() {
         assertEquals(recusionInstance.factorial(5), 120);
    }

    @Test
    public void testSum_should_succeed() {
        assertEquals(recusionInstance.sum(4), 10);
    }
}
