package com.forloop.junit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @Test
    public void sumWith3Numbers() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
//        fail("Not yet implemented");
    }

    @Test
    public void sumWith1Number() {
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
//        fail("Not yet implemented");
    }
}