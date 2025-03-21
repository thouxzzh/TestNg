package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("Login the application");
  }
  @Test
  public void f1() {
	  System.out.println("Access the application");
  }
  @Test
  public void f2() {
	  System.out.println("Logout the application");
  }
  @BeforeMethod
  public void beforeMethod() {
	  //reporting
	  System.out.println("---before method");
  }

  @AfterMethod
  public void afterMethod() {
	  //finalize the report
	  System.out.println("---after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("---before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("---after class");
  }

  @BeforeTest
  public void beforeTest() {
	  //open browser
	  System.out.println("---before test---");
  }

  @AfterTest
  public void afterTest() {
	  //close browser
	  System.out.println("---after test---");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("--This will execute before suite---");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("--This will execute after suite---");
  }

}
