package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    //halaman 26 TestNG
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void testOne(){
        System.out.println("Test One");
    }

    @Test //disebut Method
    public void testTwo(){
        System.out.println("Test Two");
    }


    @AfterMethod //dieksekusi setelah after method dan before method
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    //hasil :
    //Before Class
    //Before Method
    //Test One
    //After Method
    //Before Method
    //Test Two
    //After Method
    //After Class





}
