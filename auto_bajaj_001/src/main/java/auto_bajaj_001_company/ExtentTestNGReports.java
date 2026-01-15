package auto_bajaj_001_company;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestNGReports {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	public void setupReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void googleTitleTest() {
		test = extent.createTest("Google Title Test");
		driver.get("https://www.google.com");

		// This will FAIL intentionally
		WebElement element = driver.findElement(By.id("nonExistingElement"));
		element.click();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail("Test Failed: " + result.getThrowable());

			// Capture screenshot
			String screenshotPath = captureScreenshot(result.getName());
			test.addScreenCaptureFromPath(screenshotPath);
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass("Test Passed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.skip("Test Skipped");
		}

		driver.quit();
	}

	public String captureScreenshot(String testName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "reports/screenshots/" + testName + ".png";
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

	@AfterSuite
	public void flush() {
		extent.flush();
	}
}
