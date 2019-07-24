package com.newtours.automate.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {
	
	public static void selectTripType(WebDriver driver, String tripValue) {
		driver.findElement(By.xpath("//input[@value='" + tripValue + "']")).click();
	}
	
	public static void selectPassenger(WebDriver driver, String passenger) {
		WebElement dd = driver.findElement(By.name("passCount"));
		Select obj = new Select(dd);
		obj.selectByVisibleText(passenger);
	}
	
	public static void selectDepartCity(WebDriver driver, String city) {
		WebElement dd = driver.findElement(By.name("fromPort"));
		Select obj = new Select(dd);
		obj.selectByVisibleText(city);
	}
	
	public static void selectFromMonth(WebDriver driver, String month) {
		WebElement dd = driver.findElement(By.name("fromMonth"));
		Select obj = new Select(dd);
		obj.selectByVisibleText(month);
	}
	
	public static void selectFromDate(WebDriver driver, String date) {
		WebElement dd = driver.findElement(By.name("fromDay"));
		Select obj = new Select(dd);
		obj.selectByVisibleText(date);
	}
	
	public static void selectArriveCity(WebDriver driver, String city) {
		WebElement dd = driver.findElement(By.name("toPort"));
		Select obj = new Select(dd);
		obj.selectByVisibleText(city);
	}
	
	public static void selectClass(WebDriver driver, String classLevel) {
		driver.findElement(By.xpath("//input[@value='" + classLevel + "']")).click();
	}
	
	public static void clickSearch(WebDriver driver) {
		driver.findElement(By.name("findFlights")).click();
	}

}
