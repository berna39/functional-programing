package com.terminator.scenarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class _CompositionTest {

    private _Composition compositionInstance;

    @Before
    public void setUp() {
        compositionInstance = new _Composition();
    }

    @Test
    public void testProcessName_should_succeed() {
        assertEquals(compositionInstance.processName("     jude bellingham"), "JUDE BELLINGHAM");
    }

    @Test
    public void testProcessName_should_fail() {
        assertNotEquals(compositionInstance.processName("     jude bellingham"), " JUDE BELLINGHAM");
    }

    @Test
    public void testLogThenSqrt_should_succeed() {
         assertEquals(compositionInstance.logThenSqrt(Double.valueOf(3.14)),
            Double.valueOf(1.0696835045564468));
    }

    @Test
    public void testSqrtThenLog_should_succeed() {
         assertEquals(compositionInstance.sqrtThenLog(Double.valueOf(3.14)),
            Double.valueOf(0.572111399960081));
    }
}
