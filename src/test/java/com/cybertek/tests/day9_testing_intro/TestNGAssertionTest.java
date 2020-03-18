package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest {
    @Test
    public void test1(){
        String expected = "one";
        String actual = "one";

        Assert.assertEquals( actual, expected );
        Assert.assertEquals(1,1);
        Assert.assertEquals("true","true");
        System.out.println("test1 complete");
    }


    @Test
    public void test2(){
        String expected = "one";
        String actual = "two";
        System.out.println(" starting to compare");

        Assert.assertEquals( actual, expected );

        System.out.println("test2 complete");
    }

    @Test
    public void test3(){
        String expected = "one";
        String actual = "two";

        Assert.assertNotEquals( actual, expected );
        Assert.assertNotEquals( 1,2 );

    }



    @Test
    public void test4(){
        String expected = "one";
        String actual = "one";

        System.out.println(expected.equals(actual));
        Assert.assertTrue(expected.equals(actual));

        int e = 100;
        int a = 200;
        Assert.assertTrue(a>e);
    }

    public void test5(){
        String expected = "http://google.com/";
        String actual = "http://google.com/ ";
        Assert.assertEquals(expected,actual);

        // verify that title starts with java
        String expected1 = "java";
        String actual1 = "java- Google Search";

        Assert.assertTrue(expected1.startsWith(actual1));
    }

}
