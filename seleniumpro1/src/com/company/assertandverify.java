package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertandverify {
    /* @Test
    public static void assertthins(){
        //hard asseration
        System.out.println("Before asserstion");
        Assert.assertEquals(true,false);
        System.out.println("after asseration");

    }*/
    @Test
    public static void verification(){
        //soft asseration
        SoftAssert assert1=new SoftAssert();
        System.out.println("before asseration");
        assert1.fail();
        System.out.println("after asseration");

    }
}
