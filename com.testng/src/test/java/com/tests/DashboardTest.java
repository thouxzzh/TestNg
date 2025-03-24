package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {

    @Test
    public void verifyDashboardTitle() {
        // Login first
        LoginPage objlogin = new LoginPage(driver);
        objlogin.login("Admin", "admin123");

        // Navigate to Dashboard and verify title
        DashboardPage dashboardPage = new DashboardPage(driver);
        
        String actualTitle = dashboardPage.getDashboardTitle();
        Assert.assertEquals(actualTitle, "Dashboard", "Dashboard title mismatch!");
        System.out.println("Dashboard done successfully");
    }
}
