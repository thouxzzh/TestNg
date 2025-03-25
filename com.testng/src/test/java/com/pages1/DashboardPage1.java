package com.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage1 extends BasePage1 {
    
    public DashboardPage1(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); // Initialize Page Factory elements
    }

    // Correct @FindBy annotation
    @FindBy(xpath = "//div[@class='oxd-topbar-header-title']//h6")
    public WebElement dashboardTitle;

    // Corrected Method to get Dashboard Title text
    public String getDashboardTitle() {
        return dashboardTitle.getText(); // Directly use WebElement reference
    }
}
