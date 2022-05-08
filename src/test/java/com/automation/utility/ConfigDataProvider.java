package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Unable to read config file.." + e.getMessage());
		}

	}

	public String getDatafromConfig(String keytoserach) {
		return pro.getProperty(keytoserach);

	}

	public String getBrowser() {
		return pro.getProperty("Browser");

	}

	public String geturl() {
		return pro.getProperty("url");
	}
}
