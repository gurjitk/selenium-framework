package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

public class TestCases extends BaseClass {

	@Test
	public void loginapp() {
		logger = report.createTest("Login Test");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting application");
		loginPage.logintoapp(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 1));
		logger.pass("Test passed");

	}
}