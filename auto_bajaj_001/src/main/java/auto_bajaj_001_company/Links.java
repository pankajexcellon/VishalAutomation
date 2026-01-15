package auto_bajaj_001_company;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (WebElement link : allLinks) {
            String linkText = link.getText();
            String url = link.getAttribute("href");
 
            System.out.println("Link Text: " + linkText);
            System.out.println("URL: " + url);
            System.out.println("---------------");
        }
        driver.quit();
        
	}  	


}
