package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;
@Listeners(CustomListener.class)
public class CreateNewCustomerAndProject extends BaseTest{

	@Test
	public void createNewCustomerAndProject_TC() throws IOException, EncryptedDocumentException, InterruptedException {
		
		Flib lib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		String usn = lib.readPropertyData(PROP_PATH, "username");
        String pwd = lib.readPropertyData(PROP_PATH, "password");
		 lp.validLoginMethod(usn,pwd);
		
		
		
		HomePage hp = new HomePage(driver);
		hp.getTaskModule().click();
		
		TaskPage tp = new TaskPage(driver);
		tp.createCustomer(lib.readExcelData(EXCEL_PATH, "taskpagecreds", 1, 0));
		
		tp.createProject(lib.readExcelData(EXCEL_PATH, "taskpagecreds", 1, 0),lib.readExcelData(EXCEL_PATH, "taskpagecreds", 1, 1));
		
		Thread.sleep(5000);
		tp.deleteAllCustomerAndProjects();
		

	}

}
