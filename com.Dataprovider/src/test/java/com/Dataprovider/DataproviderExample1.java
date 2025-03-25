package com.Dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataproviderExample1 {
	WebDriver driver;
	
	@DataProvider(name="testData")
	public Object[][] dataProvFunc(){
		return new Object[][] {{"Selenium"},{"TestNG"}};
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Start the test");
		driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}
	
	
  @Test(dataProvider = "testData")
  public void search(String KeyWord) {
	  WebElement txtbox=driver.findElement(By.id("sb_form_q"));
	  txtbox.sendKeys(KeyWord);
	  System.out.println("Keyword entered is"+KeyWord);
	  txtbox.sendKeys(Keys.ENTER);
	  System.out.println("Search result is displayed");
	  
	  String expectedTitle="Search - Microsoft Bing";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
	  System.out.println(driver.getTitle());
	  
  }
  
  @AfterMethod
  public void afterMethod() {
		  driver.quit();
	   System.out.println("End the Test");
	  }
  }
