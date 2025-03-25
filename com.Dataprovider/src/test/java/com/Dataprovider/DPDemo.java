package com.Dataprovider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo{
	
	WebDriver driver;
	
	@DataProvider(name="testData")
	public Object[][] dataProvFunc(){
		return new Object[][] {{"Selenium"},{"TestNG"},{"Automation"}};
	}
}

	
