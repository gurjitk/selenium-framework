package com.automation.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	// Screenshot, alerts, frames, multiple windows

	public static String captureScreenshot(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath = System.getProperty("user.dir") + "./Screenshots/FreeCRM_" + getCurrentDateTime()
				+ ".png";

		try {
			FileHandler.copy(src, new File(screenshotpath));

		} catch (Exception e) {
			System.out.println("Unable to capture screenshot.." + e.getMessage());
		}
		return screenshotpath;
	}

	public static String getCurrentDateTime() {
		SimpleDateFormat customformat = new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
		Date date = new Date();
		return customformat.format(date);

	}
}
