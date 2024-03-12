package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest test = new BaseTest();
		test.setUp();
		
		Flib lib = new Flib();
		
		LoginPage ln = new LoginPage(driver);
		
		int rc = lib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			ln.invalidLoginMethod(lib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0),lib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}
        test.tearDown();
	}

}
