package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name="user-name") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(name="login-button") WebElement button;
	
	public void logintoapp(String uname, String pass) {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
		username.sendKeys(uname);
		password.sendKeys(pass);
		button.click();
	}
}
