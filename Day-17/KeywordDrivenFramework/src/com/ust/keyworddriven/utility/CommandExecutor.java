package com.ust.keyworddriven.utility;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.ust.keyworddriven.utility.ConfigReader.*;


import com.ust.keyworddriven.dto.CommandDTO;

public class CommandExecutor {
	
	
	
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
				Object object = Class.forName(getClassName()).newInstance();
				// Read the List One By One
				for(int i = 1; i<commandList.size(); i++){
					CommandDTO commandDTO=commandList.get(i);
					
					Method method = object.getClass().getDeclaredMethod(commandDTO.getCommand(), CommandDTO.class);
					method.invoke(object, commandDTO);
				}
					/*if(commandDTO.getCommand().equalsIgnoreCase("browser")){
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
							element = this.ById(array[1]);
							
						}
						else
						if(array[0].equalsIgnoreCase("name")){
							element = this.ByName(array[1]);
							
						}
						else
						if(array[0].equalsIgnoreCase("class")){
							element = this.ByClass(array[1]);
							
						}
						else
						if(array[0].equalsIgnoreCase("xpath")){
							element = this.ByXpath(array[1]);
							
						}
						element.sendKeys(commandDTO.getValue());
					} //type command ends
					else
					if(commandDTO.getCommand().equalsIgnoreCase("clickAndWait")){
						String target = commandDTO.getTarget();
						String array[] =target.split("="); //name=userName
						//array[0] = name  , array[1]=userName
						if(array[0].equalsIgnoreCase("id")){
							element = this.ById(array[1]);
							
						}
						else
						if(array[0].equalsIgnoreCase("name")){
							element = this.ByName(array[1]);
							
						}
						else
						if(array[0].equalsIgnoreCase("class")){
							element = this.ByClass(array[1]);
							
						}
						else
						if(array[0].equalsIgnoreCase("xpath")){
							element = this.ByXpath(array[1]);
							
						}
						element.click();
					}  // clickAndWait Code Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("assertTitle")){
						String expectedTitle = commandDTO.getTarget();
						String actualTitle = driver.getTitle();
						Assert.assertTrue(actualTitle.contains(expectedTitle));
					}*/
				//}  // Loop Ends
				//driver.close();
			} // If Check Blank Ends Here
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
