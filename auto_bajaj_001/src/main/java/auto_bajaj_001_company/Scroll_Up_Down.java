package auto_bajaj_001_company;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Up_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/date/dateadded.html?d1=30&m1=8&y1=2024&type=add&ay=&am=1&aw=&ad=&rec=");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		
//		Add a Cookie
		
		Cookie cookie = new Cookie("testCookie", "123457574848");
		driver.manage().addCookie(cookie);

//		// Code down this line will get all cookies of the specific page.

		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie1 : cookies) {
			System.out.println(cookie1.getName() + " : " + cookie1.getValue());

		}

		// Get Specific cookie by name

		Cookie cookie1 = driver.manage().getCookieNamed("testCookie");
		System.out.println(cookie1.getValue());

    	driver.quit();

	}
}
