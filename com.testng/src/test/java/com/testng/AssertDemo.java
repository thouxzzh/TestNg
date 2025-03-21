package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertDemo {
	public WebDriver driver;
  @Test
  public void verifyTitle(){
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
  }
  @BeforeTest
  public void beforeTest() {
		  ChromeOptions options = new ChromeOptions();
	        driver = new ChromeDriver(options);  
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.google.co.in/");
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
