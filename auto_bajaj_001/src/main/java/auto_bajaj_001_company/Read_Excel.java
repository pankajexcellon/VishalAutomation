package auto_bajaj_001_company;

import java.io.InputStream;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;

public class Read_Excel {

    public static void main(String[] args) throws Exception {

        InputStream fis = Read_Excel.class
                .getResourceAsStream("/testdata/Book.xlsx");

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        fis.close();
    }
    public class SampleTest {

	    @Test
	    public void testExample() {
	        System.out.println("TestNG works");
	    }
	}
}
