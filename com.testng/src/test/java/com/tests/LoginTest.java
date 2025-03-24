package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.tests.BaseTest;
import com.pages.LoginPage;

public class LoginTest extends BaseTest { 
    LoginPage loginPage;

    @Test
    public void testLogin() {
        loginPage = new LoginPage(driver); 

        String actualTitle = loginPage.getLoginTitle();
        Assert.assertTrue(actualTitle.contains("Login"));
        System.out.println("Login done successfully");
    }
}
