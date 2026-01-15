import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideUseInSameClass {

    @DataProvider(name = "credentials")
    public Object[][] data() {
        return new Object[][] {
            {"admin", "admin123"},
            {"user", "user123"}
        };
    }

    @Test(dataProvider = "credentials")
    public void loginTest(String user, String pass) {
        System.out.println(user + " " + pass);
    }
}