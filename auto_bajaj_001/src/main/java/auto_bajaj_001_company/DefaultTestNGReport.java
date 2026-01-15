package auto_bajaj_001_company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DefaultTestNGReport {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void GetGoogleTitle() {
		
		driver.get("https//:www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@AfterTest
	public void test() {
		driver.quit();
	}

}
