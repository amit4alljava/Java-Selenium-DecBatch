package com.ust.keyworddriven.utility;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static com.ust.keyworddriven.utility.ConfigReader.*;

import com.ust.keyworddriven.dto.CommandDTO;

public class CommandUtility {
	
	WebDriver driver;
	
	
	private WebElement id(String id){
		return driver.findElement(By.id(id));
	}
	
	private WebElement name(String name){
		return driver.findElement(By.name(name));
	}
	
	private WebElement css(String className){
		return driver.findElement(By.cssSelector(className));
	}
	
	private WebElement xpath(String xpath){
		return driver.findElement(By.xpath(xpath));
	}


	
	public void type(CommandDTO commandDTO) throws Exception{
		String target = commandDTO.getTarget();
		String array[]= target.split("=");
		Method method = this.getClass().getDeclaredMethod(array[0], String.class);
		WebElement element = (WebElement)method.invoke(this, array[1]);
		element.sendKeys(commandDTO.getValue());
		 
	}
	
	public void browser(CommandDTO commandDTO){
		if(commandDTO.getTarget().equalsIgnoreCase("chrome")){
		System.setProperty(getChromeDriver(), getChromeDriverPath());
		driver = new ChromeDriver();
		}
		else
		if(commandDTO.getTarget().equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
	}
	
	public void open(CommandDTO commandDTO){
		driver.get(commandDTO.getTarget());
	}
	
	public void clickAndWait(CommandDTO commandDTO) throws Exception{
		String target = commandDTO.getTarget();
		String array[]= target.split("=");
		Method method = this.getClass().getDeclaredMethod(array[0], String.class);
		WebElement element = (WebElement)method.invoke(this, array[1]);
		element.click();
	}
	
	public void assertTitle(CommandDTO commandDTO){
		String expectedValue = commandDTO.getTarget();
		String actualValue =driver.getTitle();
		Assert.assertTrue(actualValue.contains(expectedValue));
		driver.close();
	}
	

}
