package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest test = new BaseTest();
		test.setUp();
		
		Flib lib = new Flib();
		
		LoginPage ln = new LoginPage(driver);
		
		ln.validLoginMethod(lib.readPropertyData(PROP_PATH,"username"),lib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		
		test.tearDown();

	}

}
