package com.testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
@Listeners(com.testng.ListenerDemo.class)
public class TestNG_Task1 {
  WebDriver driver;
  @Test 
  public void LogInValidation() {
	  WebElement log=driver.findElement(By.xpath("//h5"));
	  String ex=log.getText();
	  String ac="Login";
	  Assert.assertEquals(ex, ac);
	  System.out.println("Login Page is Displayed");
	  WebElement ip=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	  ip.sendKeys("Admin");
	  WebElement pw=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	  pw.sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
  }
  @Test
  public void verifyLogin() {
	  WebElement tit=driver.findElement(By.xpath("//h6"));
	  String t1="Dashboard";
	  String t2=tit.getText();
	  Assert.assertEquals(t1,t2);
	  System.out.println("Login Verified");
  }
  @BeforeTest
  @Parameters({"browser"})
  public void beforeMethod(String browser1){
	  if(browser1.equalsIgnoreCase("Chrome")) {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  else if(browser1.equalsIgnoreCase("Edge")){
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
  }
  @AfterTest
  public void afterMethod() {
	  driver.quit();
  }
}