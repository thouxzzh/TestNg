package com.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends BasePage1 {
	
	public LoginPage1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="username")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")
	public WebElement login_text;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement login;
			  
			
	public WebElement Login;
	public void login(String strUserName,String strPassword) {
		
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		login.click();
		
	}
	public String getLoginPageText() {
		return login_text.getText();
	}
  
}