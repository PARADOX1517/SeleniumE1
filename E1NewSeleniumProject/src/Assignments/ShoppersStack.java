package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com");
		Thread.sleep(8000);
		
		WebElement button = driver.findElement(By.name("loginBtn"));
		button.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("zubaidkhan1517@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("Zubaid@123");
		Thread.sleep(2000);
		
		WebElement loginBtn = driver.findElement(By.id("Login"));
		loginBtn.click();
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("shirt");
		Thread.sleep(3000);
		
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		Thread.sleep(6000);
		
		
		

	}

}
