package com.atmecs.testscript;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class TestScript extends BaseClass {
	Properties property;
	Properties userdata;

    ReaderLocation read = new ReaderLocation();
    @Test
	public void action() throws IOException {
    property = ReaderLocation.readLocation(FilePath.locator_path);
    userdata = ReaderLocation.readLocation(FilePath.User_path);
    CommonHelpers.clickAction(driver, property.getProperty("loc_women"));	
    CommonHelpers.mouseMoveOver(driver, property.getProperty("loc_dress"));
    CommonHelpers.mouseMoveOver(driver, property.getProperty("loc_dress"));
    CommonHelpers.clickAction(driver,property.getProperty("loc_cart"));  
	CommonHelpers.clickAction(driver, property.getProperty("loc_checkout"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_finalcheckout"));
    CommonHelpers.clickAction(driver, property.getProperty("loc_table"));
	CommonHelpers.SendkeysAction(driver, property.getProperty("loc_name"),userdata.getProperty("mail"));
	CommonHelpers.SendkeysAction(driver, property.getProperty("loc_password"), userdata.getProperty("password"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_signbutton"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_address"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_checkbox"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_delivery"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_bankwire"));
	}
}

