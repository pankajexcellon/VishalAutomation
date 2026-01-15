package DataProvider;

import org.testng.annotations.DataProvider;

public class ProvideData {
	
	 @DataProvider(name = "strData")
	    public static Object[][] getSTRData() {
	        return new Object[][]{
	            {"Branch-A", "Warehouse-B", "Part", 5},
	            {"Branch-C", "Warehouse-D", "Vehicle", 1}
	        };
	 }

}