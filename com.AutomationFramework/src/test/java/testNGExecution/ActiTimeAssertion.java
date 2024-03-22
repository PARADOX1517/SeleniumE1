package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTimeAssertion {
  @Test
  public void login() {
	  
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://zubaid1517/login.do");
	
  String expectedLoginPageTitle="actiTIME - Login";
  
  
  
  }
}
