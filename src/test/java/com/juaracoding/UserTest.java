package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {

    User user;

    @BeforeMethod
    public void setUp(){
        user = new User();
    }


    @Test //(enable = false) atau (priority =1) berarti atribut nya tidak dieksekusi
    public void testCheckLogin(){ //testcase
        User user = new User();
        user.setUsername("Astrin");
        user.setPassword("1233");
        Assert.assertTrue(user.checkLogin());
    }

    //contains pada assert True
    //contains : membandingkan value dari string jika semua harus ditulis.
    // bisa juga mendeskripsikan menjadi paramater
    @Test
    public void testErrorMessage(){
        //User user = new User();
//        User user = new User();
//        user.setUsername("Astrin");
//        user.setPassword("123");
//        Assert.assertTrue(false);
        boolean result = user.getErrorMessage().contains("Invalid");
        Assert.assertTrue(result);


    }


}
