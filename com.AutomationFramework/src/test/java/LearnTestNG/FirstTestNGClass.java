package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test(priority =1)
  public void login() {
	  
	Reporter.log("This is a login method",true);
  }
  
  
  @Test(priority=2)
  public void addtoCart() {
	  
		Reporter.log("This is a add to cart method",true);
	  }
  
  
  @Test(priority=3)
  public void logout() {
	  
	  Reporter.log("This is a logout method",true);
	  }
}
