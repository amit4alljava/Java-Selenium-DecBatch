package com.ust.keyworddriven.utility;

import java.util.ResourceBundle;



public interface ConfigReader {
	// USed to Read the Config.properties files (src location)
	public static final ResourceBundle rb = ResourceBundle.getBundle("config");
	
	public static String getXLSPath(){
		return rb.getString("xlspath");
	}
	public static String getChromeDriverPath(){
		return rb.getString("chromedriverpath");
	}
	public static String getChromeDriver(){
		return rb.getString("chromedriver");
	}
}
