package auto_bajaj_001_company;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		alert.sendKeys("Gap re");
		Thread.sleep(3000);
		alert.accept();
		driver.quit();
	}
	public class SampleTest {

	    @Test
	    public void testExample() {
	        System.out.println("TestNG works by pankaj ");
	    }
	}

}
