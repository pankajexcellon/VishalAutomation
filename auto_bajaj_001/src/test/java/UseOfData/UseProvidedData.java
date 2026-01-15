package UseOfData;

import org.testng.annotations.Test;
import DataProvider.ProvideData;

public class UseProvidedData {

	@Test(dataProvider = "strData", dataProviderClass = ProvideData.class, groups = { "regression" })
	public void createSTRTest(String source, String destination, String productType, int qty) {

		System.out.println(source + " -> " + destination + " -> " + productType + " -> " + qty);
	}
}
