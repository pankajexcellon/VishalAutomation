package auto_bajaj_001_company;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNgAnnotations {
 
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
 
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
 
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
 
    @Test(priority = 1)
    public void testCase1() {
        System.out.println("Test Case 1");
    }
    
    @Test(enabled = false)
    public void testCase3() {
        System.out.println("This test is never executed");
    }
    
    @Test
    public void loginTest() {
        boolean serverDown = true;
     
        if (serverDown) {
            throw new SkipException("Skipping because server is down");
        }
        
    }
 
    @Test(priority = -1)
    public void testCase2() {
        System.out.println("Test Case 2");
    }
 
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
 
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
 
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
 
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}