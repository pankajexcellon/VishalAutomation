package DataProvider;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(MyListener.class)
public class MyTest {
	 @Test
	    public void passTest() {
	        Assert.assertTrue(true);
	    }

	    @Test
	    public void failTest() {
	        Assert.assertTrue(false);
	    }

}
