package com.newtours.automate.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static void enterUsername(WebDriver driver, String userName) {
		driver.findElement(By.name("userName")).sendKeys(userName);
	}
	
	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public static void clickLoginButton(WebDriver driver) {
		driver.findElement(By.name("login")).click();
	}

}
