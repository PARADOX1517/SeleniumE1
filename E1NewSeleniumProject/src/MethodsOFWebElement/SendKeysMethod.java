package MethodsOFWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeysMethod {

	public static void main(String[] args) {
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("http://zubaid1517/login.do");
	
	WebElement USNTB = driver.findElement(By.name("username"));
	USNTB.sendKeys("Admin");
	 
	WebElement PassTB = driver.findElement(By.name("pwd"));
	PassTB.sendKeys("manager");
	
	
	}

}
