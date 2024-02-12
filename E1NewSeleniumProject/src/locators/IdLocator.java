package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(1000);
		WebElement emailtxt = driver.findElement(By.id("email"));
		emailtxt.sendKeys("7843039791");
		
		Thread.sleep(2000);
		 
		WebElement passtxt = driver.findElement(By.id("pass"));
		passtxt.sendKeys("ZAHIDKHAN");
		Thread.sleep(2000);
		
		WebElement loginbutton= driver.findElement(By.tagName("button"));
		loginbutton.click();
		
		
		 
		 
		
		


	}

}
