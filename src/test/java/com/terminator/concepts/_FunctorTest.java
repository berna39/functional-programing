package com.terminator.concepts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class _FunctorTest {

    private _Functor functorInstance;

    @Before
    public void setUp() {
        functorInstance = new _Functor();
    }

    @Test
    public void testToUpperCaseFunctor() {
        assertEquals(functorInstance.toUpperCaseFunctor("make america great again").getValue(), 
        "MAKE AMERICA GREAT AGAIN");
        assertNotEquals(functorInstance.toUpperCaseFunctor("make america great again").getValue(), 
        "MAKE AMERICA GREAT AGAIN  ");
    }

    @Test
    public void testTripleFunctor() {
        assertEquals(functorInstance.tripleFunctor(13).getValue(), Integer.valueOf(39));
        assertNotEquals(functorInstance.tripleFunctor(13).getValue(), Integer.valueOf(40));
    }
}
