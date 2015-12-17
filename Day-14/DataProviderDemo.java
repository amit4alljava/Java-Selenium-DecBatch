import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo {
	
	@DataProvider(name="mydataprovider")
	public Object[][] dataProvider(){
		Object[][] userArray={{"amitsrivastava","amit123456"},{"ram","123"}};
		return userArray;
	}
	
	@Test(dataProvider="mydataprovider")
	public void testLogin(String userid, String password){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		//userName.sendKeys("amitsrivastava");
		userName.sendKeys(userid);
		WebElement pwd = driver.findElement(By.name("password"));
		//pwd.sendKeys("amit123456");
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
