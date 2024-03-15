package LearnTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void test1() {
	  Reporter.log("This is Test 1 ", true);
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is before Method", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is After Method", true);
  }
  
 
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is before class", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This is After Class", true);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  Reporter.log("This is before Test", true);
  }
  
  

  @AfterTest
  public void afterTest() {
	  Reporter.log("This is After Test", true);
  }
  
  

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is before Suit", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("This is After suit", true);
  }
  
  @Test
  public void test2() {
	  Reporter.log("This is Test 2 ", true);
	  
  }

}
