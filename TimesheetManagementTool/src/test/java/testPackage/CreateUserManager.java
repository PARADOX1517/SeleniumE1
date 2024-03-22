package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import genericPackage.WorkLib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;
@Listeners(CustomListener.class)
public class CreateUserManager extends BaseTest {

	@Test
	public void createUserManager_TC() throws IOException, InterruptedException {
		
		Flib lib = new Flib();
		 
		LoginPage lp = new LoginPage(driver);
		
		lp.validLoginMethod(lib.readPropertyData(PROP_PATH, "username"),lib.readPropertyData(PROP_PATH, "password"));
        
		HomePage hp = new HomePage(driver);
		hp.getUsersMOdule().click();
		
		UsersPage up = new UsersPage(driver);
	    up.getCreateNewUserButton().click();
	    
	    WorkLib wl = new WorkLib();
	    int no = wl.randomN0();
	    
	    String username = lib.readExcelData(EXCEL_PATH, "managercreds", 1, 0);
	    String password = lib.readExcelData(EXCEL_PATH, "managercreds", 1, 1);
	    String fname = lib.readExcelData(EXCEL_PATH, "managercreds", 1, 2);
	    String lname = lib.readExcelData(EXCEL_PATH, "managercreds",1, 3);
	    
	    up.createNewUserMethod(username+no, password+no, fname+no, lname+no);
	    
	    
	   
		
		
		
	}

}
