package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateNewCustomerAndProject extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest test = new BaseTest();
		test.setUp();
		
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
