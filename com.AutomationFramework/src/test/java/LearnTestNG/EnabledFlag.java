package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	 @Test(enabled=true)
	  public void login() {
		  
		  Reporter.log("login method", true);
		  
	  }
	  
	  @Test(enabled = false)
	  public void addToCart() {
		  Reporter.log("add to cart Method", true);
		  
	  }
	  
	  @Test(enabled = true)
	  public void logout() {
		  
		  Reporter.log("This method is for logout", true);
		  
	  }
}
