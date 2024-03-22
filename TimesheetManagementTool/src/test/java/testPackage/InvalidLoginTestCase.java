package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListener.class)
public class InvalidLoginTestCase extends BaseTest{

	@Test
	public void invalidLogin_TC() throws IOException, EncryptedDocumentException, InterruptedException {
		
		Flib lib = new Flib();
		
		LoginPage ln = new LoginPage(driver);
		
		int rc = lib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			ln.invalidLoginMethod(lib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0),lib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}
  
	}

}
