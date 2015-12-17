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
}
