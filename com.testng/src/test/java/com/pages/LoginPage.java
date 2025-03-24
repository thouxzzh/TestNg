package com.pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button");
    By loginTitle = By.xpath("//h5");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Set Username
    public void setUserName(String user) {
        driver.findElement(username).sendKeys(user);
    }

    // Set Password
    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    // Click Login Button with WebDriverWait
    public void clickLogin() {
       driver.findElement(loginButton).click();
    }

    // Get Login Title Text
    public String getLoginTitle() {
      String title=driver.findElement(loginTitle).getText();
      System.out.println(title);
      return title;
    }

    // Login Action
    public void login(String strUserName, String strPassword) {
        setUserName(strUserName);
        setPassword(strPassword);
        clickLogin();
    }
}
