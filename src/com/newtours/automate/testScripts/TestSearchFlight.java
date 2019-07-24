package com.newtours.automate.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.newtours.automate.objectRepo.Repository;
import com.newtours.automate.pageObjects.FlightSearch;
import com.newtours.automate.pageObjects.Login;
import com.newtours.automate.utilities.DriverObject;
import com.newtours.automate.utilities.Excel;

public class TestSearchFlight {
	
	WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver = DriverObject.get(Repository.browser);
		driver.get(Repository.url);
		ArrayList<String> list = Excel.getRowData(0);
		Login.enterUsername(driver, list.get(0));
		Login.enterPassword(driver, list.get(1));
		Login.clickLoginButton(driver);
	}
	
	@Test
	public void searchFlight() throws Exception {
		
		ArrayList<String> list = Excel.getRowData(1);
		FlightSearch.selectTripType(driver, list.get(0));
		FlightSearch.selectPassenger(driver, list.get(1));
		FlightSearch.selectDepartCity(driver, list.get(2));
		FlightSearch.selectFromMonth(driver, list.get(3));
		FlightSearch.selectFromDate(driver, list.get(4));
		FlightSearch.selectArriveCity(driver, list.get(5));
		FlightSearch.selectClass(driver, list.get(6));
		FlightSearch.clickSearch(driver);
		
	}

}
