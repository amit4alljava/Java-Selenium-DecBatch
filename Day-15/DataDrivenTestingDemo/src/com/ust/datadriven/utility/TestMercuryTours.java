package com.ust.datadriven.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.ust.datadriven.utility.ConfigReader.*;

public class TestMercuryTours {
	
	@DataProvider(name="dataprovider")
	public Object[][] mydataProvider(){
		//ExcelReader reader = new ExcelReader();
		DBReader reader = new DBReader();
		Object[][] array={};
		try {
			//array = reader.readExcel();
			array = reader.readDB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
	
	@Test(dataProvider="dataprovider")
	public void testLogin(String userid , String password){
		//System.setProperty("webdriver.chrome.driver", 
			//	"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty(getChromeDriverName(),getChromeDriverPath());
		WebDriver driver = new ChromeDriver();
		
		driver.get(getURL());
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys(userid);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement msg = driver.
				findElement(By.xpath("//tr[3]/td/font"));
		
		String expectedMsg = "Use our Flight Finder";
		String actualMsg = msg.getText();
		//String actualMsg = driver.getTitle();
		Assert.assertTrue(actualMsg.contains(expectedMsg));
		driver.close();
	
	}

}
