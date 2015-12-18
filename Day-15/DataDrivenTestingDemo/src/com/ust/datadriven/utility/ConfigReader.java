package com.ust.datadriven.utility;

import java.util.ResourceBundle;

/*
 * It will the Config File
 */
public interface ConfigReader {
	// .properties file (it is called resource bundle)
	//and to read the resource bundle file we have the ResourceBundle class
	final static ResourceBundle rb=ResourceBundle.getBundle("config");
	//private static ResourceBundle rb3= new ResourceBundle("config");
	//private static ResourceBundle rb2=ResourceBundle.getBundle("config2");


public static String getXLSPath(){
	
	return rb.getString("xlspath");
}

public static String getChromeDriverPath(){
	return rb.getString("chromedriverpath");
}
public static String getChromeDriverName(){
	return rb.getString("chromedrivername");
}
public static String getURL(){
	return rb.getString("websiteurl");
}

public static String getDriver(){
	return rb.getString("drivername");
}

public static String getConnectionURL(){
	return rb.getString("connectionurl");
}

public static String getUserid(){
	return rb.getString("userid");
}

public static String getPassword(){
	return rb.getString("password");
}

public static String getSQL(){
	return rb.getString("sql");
}

public static int getRow(){
	return Integer.parseInt(rb.getString("row"));
}

public static int getColumn(){
	return Integer.parseInt(rb.getString("col"));
}

}
