//package com.testng;
//
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterTest;
//
//public class NewTest {
//  public WebDriver driver;
//	@Test
//  public void validation() {
//		WebElement ele=driver.findElement(By.xpath("//a[@id=\"login_Layer\"]"));
//		ele.click();
//  }
//  @BeforeTest
//  public void beforeTest() {
//	  ChromeOptions options=new ChromeOptions();
//	  WebDriver driver=new ChromeDriver(options);
//	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.get("https://www.naukri.com");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  if(driver!=null) {
//	  driver.quit();
//  }
//  }
//}

package com.testng;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
    public WebDriver driver;  // Class-level driver

    @BeforeTest
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);  // Assigning to class-level driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com");
    }

    @Test
    public void validation() {
        WebElement ele = driver.findElement(By.xpath("//a[@id='login_Layer']"));
        ele.click();
    }

    @AfterTest
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
