package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://zubaid1517/login.do");
		Thread.sleep(2000);
		
		WebElement emailTextbox = driver.findElement(By.name("username"));
		emailTextbox.sendKeys("Admin");
		Thread.sleep(2000);
       
		WebElement passTextbox = driver.findElement(By.name("pwd"));
		passTextbox.sendKeys("manager"); 
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		
		
		
	}

}
