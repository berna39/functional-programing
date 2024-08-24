package com.terminator.concepts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class _MonadsTest {

    private _Monads monadInstance;

    @Before
    public void setUp() {
        monadInstance = new _Monads();
    }

    @Test
    public void testGetEmptyMaybe() {
        assertEquals(monadInstance.getEmptyMaybe(), null);
        assertNotEquals(monadInstance.getEmptyMaybe(), Integer.valueOf(13));
    }

    @Test
    public void testSimpleWrappingExample() {
        assertEquals(monadInstance.simpleWrappingExample(13), Integer.valueOf(13));
        assertNotEquals(monadInstance.simpleWrappingExample(13), null);
    }

    @Test
    public void testWrapAndDouble() {
        assertEquals(monadInstance.wrapAndDouble(13), Integer.valueOf(26));
        assertNotEquals(monadInstance.wrapAndDouble(13), null);
    }
}
