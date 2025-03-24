package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Dashboard Title
    By dashboard = By.xpath("//div[@class='oxd-topbar-header-title']//h6");

    // Method to get the Dashboard Title text
    public String getDashboardTitle() {
        return driver.findElement(dashboard).getText();
    }
}
