package com.tests1;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages1.LoginPage1;

public class LoginTest1 extends BaseTest1 {

    @Test
    public void verifyLogin() {
        // Step 1: Initialize LoginPage1
        LoginPage1 loginPage = new LoginPage1(driver);
        
        // Step 2: Perform Login
        loginPage.login("Admin", "admin123");

        // Step 3: Verify successful login by checking login page title
        String actualText = loginPage.getLoginPageText();
        String expectedText = "Login"; // Modify based on actual UI text
        
        System.out.println("Login Page Text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "Login Page text mismatch!");
    }
}
