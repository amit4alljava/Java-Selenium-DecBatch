import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// Step-1 Connect to the Driver (FireFox)
		// Chrome Driver Path
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver(); // Upcasting
		WebDriver driver = new ChromeDriver();
		// Step -2 Connect to the URL
		// Shortcut for Import Ctrl + Shift + O
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();  // It will maximize the wbrowser window
		//Thread.sleep(2000);
		// Step -3 Find the Element By Id or Name or Class or Xpath
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.sendKeys("amitsrivastava");  // setting the value of userName
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("amit123456");
		
		WebElement loginButton =  driver.findElement(By.name("login"));
		loginButton.click();
		
		// Radio Button Selection Code
		List<WebElement> radioButtons = driver.findElements(By.name("tripType"));
		radioButtons.get(1).click();
		
		// Select Combo Box (Drop Down Box)
		WebElement passengerCountDropDown = driver.findElement(By.name("passCount"));
		Select pcSelect = new Select(passengerCountDropDown);
		pcSelect.selectByVisibleText("4");
		
		WebElement depFrom = driver.findElement(By.name("fromPort"));
		Select dpSelect = new Select(depFrom);
		dpSelect.selectByVisibleText("New York");
		//driver.close();   // Close the Browser
		
		WebElement arrFrom = driver.findElement(By.name("toPort"));
		Select ArrSelect = new Select(arrFrom);
		ArrSelect.selectByVisibleText("London");
		
		List<WebElement> serviceRadioButtons = 
				driver.findElements(By.name("servClass"));
		serviceRadioButtons.get(1).click();
		
		WebElement continueBt = driver.findElement(By.name("findFlights"));
		continueBt.click();
		
		String pageTitle =driver.getTitle();
		WebElement xpath = driver.
				findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font"));
		
		String txt = xpath.getText();
		if(pageTitle.equals("Select a Flight: Mercury Tours") && txt.equals("New York to London")){
			System.out.println("Test is Pass ");
		}
		else{
			System.out.println("Test is Fail...");
		}
		
		

	}

}
