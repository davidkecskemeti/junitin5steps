package com.forloop.junit;

import org.junit.Test;

import static org.junit.Assert.*;
public class AssertTest {

    @Test
    public void test() {
        assertEquals(1, 1);
        assertTrue(true);
        assertFalse(false);
    }
}
