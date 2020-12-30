

package com.atmecs.filepath;

import java.io.File;

public class FilePath {
	public static final String User_Home = System.getProperty("user.dir") + File.separator;
	public static final String Driver_Path = "/lib/chromedriver.exe";
	public static final String Location_Reader = "./src/main/java/com/atmecs/readerlocation";
	public static final String Config_Path = "./src/test/resources/config.property";
	public static final String locator_path = "./src/test/resources/locators.property";
	public static final String User_path = "./src/test/resources/userdata.property";
}
