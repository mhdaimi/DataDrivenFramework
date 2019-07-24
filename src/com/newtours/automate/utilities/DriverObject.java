package com.newtours.automate.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverObject {
	
	static WebDriver driver;
	
	public static WebDriver get(String browserName) throws Exception {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid browser name");
		}
		return driver;
	}

}
