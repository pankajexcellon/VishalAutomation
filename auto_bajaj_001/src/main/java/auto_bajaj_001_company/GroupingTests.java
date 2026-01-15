package auto_bajaj_001_company;

import org.testng.annotations.Test;

public class GroupingTests {
 
    @Test(groups = {"smoke"})
    public void verifyLogin() {
        System.out.println("Login test");
    }
 
    @Test(groups = {"regression"})
    public void verifyForgotPassword() {
        System.out.println("Forgot Password test");
    }
 
    @Test(groups = {"smoke", "regression"})
    public void verifyLogout() {
        System.out.println("Logout test");
    }
}
