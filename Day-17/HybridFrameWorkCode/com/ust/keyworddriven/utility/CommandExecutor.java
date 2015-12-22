package com.ust.keyworddriven.utility;

import static com.ust.keyworddriven.utility.ConfigReader.getChromeDriver;
import static com.ust.keyworddriven.utility.ConfigReader.getChromeDriverPath;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ust.keyworddriven.dto.CommandDTO;

public class CommandExecutor {
	
	private int counter ;
	
	@DataProvider(name="dataprovider")
	public Object[][] mydataProvider(){
		ExcelReader reader = new ExcelReader();
		
		Object[][] array={};
		try {
			//array = reader.readExcel();
			array = reader.readExcelData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
	
	@BeforeMethod
	public void start(){
		counter=0;
	}
	
	@Test(dataProvider="dataprovider")
	public void testExecute(String userid, String password) throws Exception{
		WebDriver driver = null;
		WebElement element = null;
		// Step-1 Read the Excel Data
		ExcelReader reader =new ExcelReader();
		try {
			ArrayList<CommandDTO> commandList = reader.readExcel();
			// Checking XLS Data is not Empty
			if(commandList!=null && commandList.size()>0){
			for(CommandDTO commandDTO : commandList){
					if(commandDTO.getCommand().equalsIgnoreCase("browser")){
						if(commandDTO.getTarget().equalsIgnoreCase("chrome")){
							System.setProperty(getChromeDriver(), 
										getChromeDriverPath());
						 driver = new ChromeDriver();
						}
						else
						if(commandDTO.getTarget().equalsIgnoreCase("firefox")){
							driver = new FirefoxDriver();
						}
						driver.manage().window().maximize();
					}  // Browser Command Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("open")){	
						driver.get(commandDTO.getTarget());
					}  // Open COmmand Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("type")){
						String target = commandDTO.getTarget();
						String array[] =target.split("="); //name=userName
						//array[0] = name  , array[1]=userName
						if(array[0].equalsIgnoreCase("id")){
							element = driver.findElement(By.id(array[1]));
							
						}
						else
						if(array[0].equalsIgnoreCase("name")){
							element = driver.findElement(By.name(array[1]));
							
						}
						else
						if(array[0].equalsIgnoreCase("class")){
							element = driver.findElement(By.cssSelector(array[1]));
							
						}
						else
						if(array[0].equalsIgnoreCase("xpath")){
							element = driver.findElement(By.xpath(array[1]));
							
						}
						if(counter==0){
							commandDTO.setValue(userid);
						}
						else
							if(counter==1)
						{
							commandDTO.setValue(password);
						}
								
						counter++;
						
						element.sendKeys(commandDTO.getValue());
					} //type command ends
					else
					if(commandDTO.getCommand().equalsIgnoreCase("clickAndWait")){
						String target = commandDTO.getTarget();
						String array[] =target.split("="); //name=userName
						//array[0] = name  , array[1]=userName
						if(array[0].equalsIgnoreCase("id")){
							element = driver.findElement(By.id(array[1]));
							
						}
						else
						if(array[0].equalsIgnoreCase("name")){
							element = driver.findElement(By.name(array[1]));
							
						}
						else
						if(array[0].equalsIgnoreCase("class")){
							element = driver.findElement(By.cssSelector(array[1]));
							
						}
						else
						if(array[0].equalsIgnoreCase("xpath")){
							element = driver.findElement(By.xpath(array[1]));
							
						}
						element.click();
					}  // clickAndWait Code Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("assertTitle")){
						String expectedTitle = commandDTO.getTarget();
						String actualTitle = driver.getTitle();
						Assert.assertTrue(actualTitle.contains(expectedTitle));
					}
				}  // Loop Ends
				driver.close();
			} // If Check Blank Ends Here
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
