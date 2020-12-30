package com.atmecs.baseclass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.filepath.FilePath;

import com.atmecs.readerlocation.ReaderLocation;

public class BaseClass {
     Properties property;
    public WebDriver driver;
 	public String Url;
 	public String Browser;

     @BeforeTest
      public void invokeBrowser() throws IOException {
    	  property = ReaderLocation.readLocation(FilePath.Config_Path);
    	  System.setProperty("webdriver.chrome.driver", FilePath.Driver_Path);
    	  Url = property.getProperty("Url");
    	  Browser = property.getProperty("Browser");
  		if (Browser.equalsIgnoreCase("Chrome")) {
  			driver = new ChromeDriver();
  		}
  		driver.manage().window().maximize();
  		driver.get(Url);
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
  				
    	  
}
}

