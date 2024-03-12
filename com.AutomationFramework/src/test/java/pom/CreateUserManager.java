package pom;

import java.io.IOException;

public class CreateUserManager extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		 
		BaseTest bt = new BaseTest(); 
		bt.setUp();
		
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
