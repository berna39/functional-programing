package com.terminator.scenarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class _CurryingTest {

    private _Currying curryingInstance;

    @Before
    public void setUp() {
        curryingInstance = new _Currying();
    }

    @Test
    public void testFirstExample() {
        assertEquals(curryingInstance.firstExample(12d, 5d), Double.valueOf(60));
        assertNotEquals(curryingInstance.firstExample(12d, 5d), Double.valueOf(62));
    }

    @Test
    public void testSecondExample() {
        assertNotEquals(curryingInstance.secondExample(34d, 14d), Double.valueOf(475));
        assertEquals(curryingInstance.secondExample(34d, 14d), Double.valueOf(476));
    }

    @Test
    public void testThridExample() {
        assertEquals(curryingInstance.thridExample(600, 60, 9), 669);
        assertNotEquals(curryingInstance.thridExample(600, 60, 9), 666);
    }
}
