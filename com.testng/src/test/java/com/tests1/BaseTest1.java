package com.tests1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest1{
	public static WebDriver driver;
	public final static int TIMEOUT=10;
	
	@BeforeMethod
	public void setup() {
		
		ChromeOptions options =new ChromeOptions();
//		options.addArguments();
//		options.addArguments(null);
		driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
  }
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}