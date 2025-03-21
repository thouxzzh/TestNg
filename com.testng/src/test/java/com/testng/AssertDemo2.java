package com.testng;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertDemo2{
    @Test
    public void testAssertions() {
        // Test data
        String str1 = new String("TestNG");
        String str2 = new String("TestNG");
        String str3 = null;
        String str4 = "TestNG";
        String str5 = "TestNG";
        String str6 = new String("NOT_TestNG");

        int val1 = 5;
        int val2 = 6;

        Assert.assertEquals(str1, str2);
        System.out.println("Equals Assertion is successful");


        Assert.assertTrue(val1 < val2);
        System.out.println("True Assertion is successful");

        Assert.assertFalse(val1 > val2);
        System.out.println("False Assertion is successful");

        Assert.assertNotNull(str1);
        System.out.println("Not Null Assertion is successful");

        Assert.assertNull(str3);
        System.out.println("Null Assertion is successful");

        Assert.assertSame(str4, str5);
        System.out.println("Same Assertion is successful");

        Assert.assertNotSame(str1, str3);
        System.out.println("Not Same Assertion is successful");
    }
}
