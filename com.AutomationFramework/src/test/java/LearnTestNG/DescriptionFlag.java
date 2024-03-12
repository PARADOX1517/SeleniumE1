package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description="This method is for login",priority = 1)
  public void login() {
	  
	  Reporter.log("login method", true);
	  
  }
  
  @Test(description="This method is for addToCart",priority=2)
  public void addToCart() {
	  Reporter.log("add to cart Method", true);
	  
  }
  
  @Test(description="This method is for logout",priority = 3)
  public void logout() {
	  
	  Reporter.log("This method is for logout", true);
	  
  }
}
