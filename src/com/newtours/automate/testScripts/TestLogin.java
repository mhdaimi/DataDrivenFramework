package com.newtours.automate.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.newtours.automate.objectRepo.Repository;
import com.newtours.automate.pageObjects.Login;
import com.newtours.automate.utilities.DriverObject;
import com.newtours.automate.utilities.Excel;

public class TestLogin {
	
	@Test
	public void login() throws Exception {
		WebDriver driver = DriverObject.get(Repository.browser);
		driver.get(Repository.url);
		Login.enterUsername(driver, "batman");
		Login.enterPassword(driver, "batman");
		Login.clickLoginButton(driver);
	}
	
	@Test
	public void loginFromExcelData() throws Exception {
		WebDriver driver = DriverObject.get(Repository.browser);
		driver.get(Repository.url);
		ArrayList<String> data = Excel.getRowData(0);
		Login.enterUsername(driver, data.get(0));
		Login.enterPassword(driver, data.get(1));
		Login.clickLoginButton(driver);
	}
	
	@Test
	public void loginWithInvalidUsername() throws Exception {
		WebDriver driver = DriverObject.get(Repository.browser);
		driver.get(Repository.url);
		ArrayList<String> data = Excel.getRowData(1);
		Login.enterUsername(driver, data.get(0));
		Login.enterPassword(driver, data.get(1));
		Login.clickLoginButton(driver);
	}
  
  
}
