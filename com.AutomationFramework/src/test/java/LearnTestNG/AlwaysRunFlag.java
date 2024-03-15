package LearnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
	@Test
	  public void login() {
		  
		  Assert.fail();
		  Reporter.log("This is a login method", false);
	  }
	  
	  @Test(dependsOnMethods = "login")
	  public void addToCart() {
		  
		  Reporter.log("This is a addToCart method", true);
	  }
	  
	  @Test(dependsOnMethods = "addToCart",alwaysRun = true)
	  public void logout() {
		  
		  Reporter.log("This is a logout method", true);
	  }
}
