package testNGListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTimeVerificationAndValidation {
  @Test
  public void validLogin() throws InterruptedException {
	  
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://zubaid1517/login.do");
	
	String expectedLoginPageTitle= "actiTIME - Login";
	
	  if(driver.getTitle().equals(expectedLoginPageTitle))
	 {
		Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(1000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(1000);
		 driver.findElement(By.id("loginButton")).click();
		
		 
	}
	  
	  String expectedHomePageTitle= "actiTIME - Enter Time-Track";
	  
	  if(driver.getTitle().equals(expectedHomePageTitle))
	  {
		  driver.findElement(By.partialLinkText("Logout")).click();
	  }
  }
}
