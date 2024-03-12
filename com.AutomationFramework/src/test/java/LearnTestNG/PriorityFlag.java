package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority = 1)
  public void login() {
	  
	  Reporter.log("This is a login method", false);
  }
  
  @Test(priority = 2)
  public void addToCart() {
	  
	  Reporter.log("This is a addToCart method", true);
  }
  
  @Test(priority = 3)
  public void logout() {
	  
	  Reporter.log("This is a logout method", true);
  }
  
}
