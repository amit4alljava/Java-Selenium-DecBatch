package suitedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void firstTestCase()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.close();
	}
	
	@Test
	public void secondTestCase()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://twitter.com/");
	driver.close();
	}
}
