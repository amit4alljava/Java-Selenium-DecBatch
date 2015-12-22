package suitedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void firstTestCase()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.close();
	}
	
	@Test
	public void secondTestCase()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.close();
	}
}
