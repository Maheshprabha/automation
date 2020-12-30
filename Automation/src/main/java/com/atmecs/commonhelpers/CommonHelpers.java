package com.atmecs.commonhelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class CommonHelpers {
	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();
		// System.out.println("");
	}

	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}
	public static void mouseMoveOver(WebDriver driver, String elementPath) {
		WebElement element=driver.findElement(By.xpath(elementPath));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void getValueText(WebDriver driver, String xpath, String actual, String expected) {
		String actualtext = driver.findElement(By.xpath(xpath)).getText();
		System.out.println("Actual :" + actualtext);
	}
	public static void validate(WebDriver driver, String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println(" Passed : " + " Expected : " + expected + " Actual : " + actual);
	

	}
}