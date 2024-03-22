package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListener.class)
public class ValidLoginTestCase extends BaseTest{

	@Test
	public void validLogin_TC() throws IOException, InterruptedException {
		Flib lib = new Flib();
		
		LoginPage ln = new LoginPage(driver);
		
		ln.validLoginMethod(lib.readPropertyData(PROP_PATH,"username"),lib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		

	}

}
