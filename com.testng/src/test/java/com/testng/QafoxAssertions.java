package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class QafoxAssertions {
    public WebDriver driver;

    @Test
    public void HomePage() {
        SoftAssert softAssert = new SoftAssert();

        WebElement ele = driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]"));
        ele.click();
        String expectedTitle = "Your Store";
        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);

        WebElement reg = driver.findElement(By.xpath("//a[contains(text(),\"Register\")]"));
        reg.click();
        String expectedTitle1 = "Register Account";
        String actualTitle2 = driver.getTitle();
        softAssert.assertEquals(actualTitle2, expectedTitle1);

        softAssert.assertAll();
    }

    @BeforeTest
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
