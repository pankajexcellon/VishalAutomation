package auto_bajaj_001_company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//*[@class='header_soc_twitter']"));
		act.moveToElement(menu).perform();
		Thread.sleep(3000);
		act.contextClick(menu).perform();
		Thread.sleep(3000);
		WebElement menu1 = driver.findElement(By.xpath("//*[@class=' lazyloaded']"));
		act.doubleClick(menu1).perform();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
