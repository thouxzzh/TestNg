package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class OrangeHRM_Prac{
    public WebDriver driver;

    @Test
    public void verifyLogin() {
        String expectedTitle = "OrangeHRM"; 
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

        WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
        user.sendKeys("Admin");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @BeforeTest  
    @Parameters("browser") 
    public void setUp(@Optional("chrome") String browser) {  
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser type: " + browser);
        }

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest  
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}