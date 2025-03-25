package com.tests1;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages1.DashboardPage1;
import com.pages1.LoginPage1;

public class DashboardTest1 extends BaseTest1 {

    @Test
    public void verifyDashboardTitle() {

        LoginPage1 loginPage = new LoginPage1(driver);
        loginPage.login("Admin", "admin123");

        // Step 2: Initialize DashboardPage1
        DashboardPage1 dashboardPage = new DashboardPage1(driver);

        // Step 3: Get Dashboard Title & Validate
        String actualTitle = dashboardPage.getDashboardTitle();
        String expectedTitle = "Dashboard"; 
        
        System.out.println("Dashboard Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard title mismatch!");
    }
}
