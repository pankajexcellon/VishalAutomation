package DataProvider;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyListener implements ITestListener{
	@Test
	public void onStart(ITestContext context) {
        System.out.println("Suite Started");
    }
	@Test
    public void onFinish(ITestContext context) {
        System.out.println("Suite Finished");
    }
	@Test
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }
    @Test
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }
    @Test
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }
    @Test
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }



}
