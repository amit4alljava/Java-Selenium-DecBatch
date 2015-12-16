
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase1 {

	@BeforeClass
	public void oneTimeStart(){
		System.out.println("It will call only When Class is Loaded..");
	}
	
	@AfterClass
	public void oneTimeEnd(){
		System.out.println("It Will Call When Class is UnLoaded..");
	}
	
	// It is a TestNG Annotation , and this says
	// this is your first test case (Ctrl + Shift + O) 
	
	//WebDriver driver ;
	
	/*@BeforeMethod
	public void start(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	@AfterMethod
	public void stop(){
		driver.close();
	}*/
	
	//@Test(enabled=false) 
	//@Test(timeOut=4000)
	//@Test(priority=1)
	@Test(threadPoolSize=10,invocationCount=100, timeOut=10000)
	public void testLogin(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("amitsrivastava");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("amit123456");
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
	
	/*//@Test(priority=2)
	@Test(enabled=false)
	public void testFB(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mike@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mike12324334");
		driver.findElement(By.id("u_0_v")).click();
		Assert.assertTrue(driver.getTitle().contains("Log in"));
		//driver.close();
		
	}*/
}
