import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

// Ajax + DatePicker + AutoCompleter

public class DatePickerDemo {
@Test
public void testDatePicker(){
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.makemytrip.com");
	driver.manage().window().maximize();
	WebElement source = driver.findElement(By.id("from_typeahead1"));
	source.sendKeys("Ind");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='one_round_default']/div/div[1]/div/div[1]/span/span/div[1]")));
	
	WebElement selectedSource = driver.findElement(By.xpath("//*[@id='one_round_default']/div/div[1]/div/div[1]/span/span/div[1]"));
	selectedSource.click();
	
	WebElement des = driver.findElement(By.id("to_typeahead1"));
	des.sendKeys("Goa");
	
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='one_round_default']/div/div[3]/div/div[1]/span/span/div[1]")));
	
	WebElement selectedDep = driver.findElement(By.xpath("//*[@id='one_round_default']/div/div[3]/div/div[1]/span/span/div[1]"));
	selectedDep.click();
	
	
	WebElement deptDate = driver.findElement(By.id("start_date_sec"));
	deptDate.click();
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[6]/a")));
	
	WebElement selectDeptDate = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[6]/a"));
	selectDeptDate.click();
	
	
	WebElement arrDate = driver.findElement(By.id("return_date_sec"));
	arrDate.click();
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[3]/table/tbody/tr[1]/td[7]/a")));
	
	WebElement selectArrDate = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/table/tbody/tr[1]/td[7]/a"));
	selectArrDate.click();
	
	WebElement noOfPassengerSelect = driver.findElement(By.xpath("//*[@id='adult_count']/a[2]"));
	noOfPassengerSelect.click();
	WebElement searchBt = driver.findElement(By.id("flights_submit"));
	searchBt.click();
	//*******************************************************************
	/*WebElement source = driver.findElement(By.id("BE_flight_origin_city"));
	source.sendKeys("Ind");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[15]/ul/li[4]")));
	driver.findElement(By.xpath("/html/body/div[15]/ul/li[4]")).click();
	WebElement destination = driver.findElement(By.id("BE_flight_arrival_city"));
	destination.sendKeys("GOA");
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[16]/ul/li[1]")));
	
	driver.findElement(By.xpath("/html/body/div[16]/ul/li[1]")).click();
	
	//WebElement deptDatePicker = driver.findElement(By.xpath("//*[@id='BE_flight_form']/div[2]/div[1]/ul/li[3]/i"));
	System.out.println("CSS "+driver.findElements(By.cssSelector("i[class='sprite-booking-engine ico-be-calender icon-inside']")));
	List<WebElement> deptDatePicker = driver.findElements(By.cssSelector("i[class='sprite-booking-engine ico-be-calender icon-inside]"));
	System.out.println("Date Picker "+deptDatePicker);
	deptDatePicker.get(0).click();
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("a_2015_12_25")));
	
	WebElement selectDeptDate = driver.findElement(By.id("a_2015_12_25"));
	selectDeptDate.click();
	
	WebElement arrivalDatePicker = driver.findElement(By.xpath("//*[@id='BE_flight_ret_cal']/i"));
	arrivalDatePicker.click();
	wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("a_2016_1_2")));
	
	WebElement selectArrivalDate = driver.findElement(By.id("a_2016_1_2"));
	selectArrivalDate.click();
	*/
	

	
}
}
