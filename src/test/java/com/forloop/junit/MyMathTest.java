package com.forloop.junit;


import org.junit.*;

import static org.junit.Assert.*;


public class MyMathTest {

    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void sumWith3Numbers() {
        System.out.println("Test1");
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sumWith1Number() {
        System.out.println("Test2");
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }
}