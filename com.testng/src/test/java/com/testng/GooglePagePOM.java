//package com.testng;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class GooglePagePOM{
//    WebDriver driver;  
//
//    @BeforeMethod
//    public void setup() {
//        driver = new ChromeDriver();  
//        driver.get("https://www.google.com/");
//    }
//
//    @Test
//    public void searchFor() {
//        WebElement searchBox = driver.findElement(By.xpath("//*[@name='q']")); 
//        searchBox.sendKeys("Selenium WebDriver");
//        searchBox.submit();
//    }
//
//    @AfterMethod
//    public void teardown() {
//        driver.quit();
//    }
//}
package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePagePOM {
    WebDriver driver;  

    @FindBy(name = "q")
    private WebElement searchBox;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();  
        driver.get("https://www.google.com/");
        PageFactory.initElements(driver, this); 
    }

    @Test
    public void searchFor() {
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

