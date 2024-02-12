package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chat.qspiders.com/");
		Thread.sleep(2000);
		
		WebElement emailorphone = driver.findElement(By.name("username"));
		emailorphone.sendKeys("7843039791");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Zahid@123");
		Thread.sleep(3000);
		
		WebElement btn =driver.findElement(By.cssSelector("button[type='submit']"));
		btn.click();
		
		
		
		
	}

}
