//package com.Dataprovider;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
//
//	public class DataproviderExample2{
//		public WebDriver driver;
//	
//	@BeforeMethod
//	public void setUp() {
//		System.out.println("Start the test");
//		driver=new ChromeDriver();
//		driver.get("https://www.bing.com/");
//		driver.manage().window().maximize();
//	}
//	
//	
//  @Test(dataProvider = "testData",dataProviderClass=DPDemo2.class)
//  
//  public void search(String KeyWord1,String KeyWord2) {
//	  WebElement txtbox=driver.findElement(By.id("sb_form_q"));
//	  txtbox.sendKeys(KeyWord1,KeyWord2);
//	  System.out.println("Keyword entered is"+KeyWord1+" "+KeyWord2);
//	  txtbox.sendKeys(Keys.ENTER);
//	  System.out.println("Search result is displayed");
//	  
//	  
//  }
//  
//  @AfterMethod
//  public void afterMethod() {
//		  driver.quit();
//	   System.out.println("End the Test");
//	  }
//
//	}

package com.Dataprovider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataproviderExample2{
	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("Start the test");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit Wait
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	 @Test(dataProvider = "testData", dataProviderClass = DPDemo.class)
	  public void search(String keyWord) throws InterruptedException {
	      WebElement searchbox = driver.findElement(By.name("q"));
	      searchbox.sendKeys(keyWord);
	      System.out.println("Keyword entered is: " + keyWord);
	      searchbox.sendKeys(Keys.ENTER);
	      System.out.println("Search result is displayed");

	      // Wait until the title is updated from "Search - Microsoft Bing"
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("Search - Microsoft Bing")));
       
	      // Get the actual title
	      String actualTitle = driver.getTitle();
	      System.out.println("Actual Title: " + actualTitle);
    

	      // Assert that the title contains the search keyword
	      Assert.assertTrue(actualTitle.toLowerCase().contains(keyWord.toLowerCase()), 
	          "Expected title to contain: " + keyWord + ", but got: " + actualTitle);
	  }

	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("End the test");
	}
}