package com.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

public class BasePage1 {
  public WebDriver driver;
  
  public BasePage1(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
}