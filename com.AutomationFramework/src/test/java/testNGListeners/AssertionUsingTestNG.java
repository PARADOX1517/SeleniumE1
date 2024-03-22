package testNGListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class AssertionUsingTestNG  extends BaseTest{
  @Test
  public void login()  {
	
	  // For Critical TestCases
//	    WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("http://zubaid1517/login.do");
//		
		String expectedLoginPageTitle= "actiTIME -  Login";
		
		Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page is not displayed");
		
		WebElement usn = driver.findElement(By.name("username"));
		Assert.assertEquals(usn.isDisplayed(), true, "Username textbox is not displayed");
		usn.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		Assert.assertEquals(pwd.isDisplayed(), true, "Password textbox is not displayed");
		pwd.sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Assert.assertEquals(loginButton.isDisplayed(), true, "Login Button is not displayed");
		loginButton.click();	
		
  }
}
