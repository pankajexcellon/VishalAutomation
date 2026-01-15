package auto_bajaj_001_company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	@Test
	public void verifyLoginPageTitle() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";

		Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");

		driver.quit(); // ❌ Will NOT execute if assertion fails
	}

	@Test
	public void hardAssertExample() {

		System.out.println("Step 1");
		Assert.assertEquals("Login", "Login", "Title mismatch");
		Assert.fail("Forcefully failing test");
		System.out.println("Step 2"); // ❌ Will NOT execute

	}
	@Test
	public void softAssertionTest() {
	 
	    SoftAssert softAssert = new SoftAssert();
	    System.out.println("Step 1");
	    softAssert.assertEquals("Login", "Home", "Title mismatch");
	    System.out.println("Step 2");
	    softAssert.assertTrue(false, "Condition failed");
	    softAssert.assertAll(); // Mandatory
	}
	@Test
	public void verifyLoginPage() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Gojogle";
		Assert softAssert = null;
		Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
		System.out.println("After Soft Assertion");

		driver.quit(); // ❌ Will NOT execute if assertion fails
	}
}
