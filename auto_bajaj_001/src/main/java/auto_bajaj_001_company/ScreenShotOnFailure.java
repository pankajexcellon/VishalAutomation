package auto_bajaj_001_company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotOnFailure {
 
    public @interface Run {

	}

	WebDriver driver;
 
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
 
    @Test
    public void failingTest() {
        // Intentional failure
        WebElement element = driver.findElement(By.id("nonExistingElement"));
        element.click();
    }
 
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
 
        	TakesScreenshot ts = (TakesScreenshot) driver;
    		File src = ts.getScreenshotAs(OutputType.FILE);
    		String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
    		// Destination path
    		File dest = new File("screenshots/google_" + timeStamp + ".png");
    		// Save screenshot
    		FileUtils.copyFile(src, dest);
    		System.out.println("Screenshot taken successfully");
    		driver.quit();
        }
    }
}