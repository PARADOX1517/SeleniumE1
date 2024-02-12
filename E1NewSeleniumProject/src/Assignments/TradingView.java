package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TradingView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.tradingview.com/");
		Thread.sleep(2000);
		
		WebElement getStarted = driver.findElement(By.className("tv-header__offer-button-title"));

		getStarted.click();
		Thread.sleep(2000);
		
		WebElement signUp=driver.findElement(By.className("children-LHcKxrzD"));
		signUp.click();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("Email"));
		email.click();
		Thread.sleep(2000);
		
		WebElement Enteremail = driver.findElement(By.id("id_email"));
		Enteremail.sendKeys("zubaidkhan1517@gmail.com");
		Thread.sleep(2000);
		
		WebElement Enterpass = driver.findElement(By.id("id_password"));
		Enterpass.sendKeys("Zubaid@#1234");
		Thread.sleep(3000);
		
		WebElement checkbox=driver.findElement(By.className("recaptcha-checkbox-border"));
		checkbox.click();
		Thread.sleep(3000);
		
		WebElement clickOnButton = driver.findElement(By.className("content-D4RPB3ZC"));
		clickOnButton.click();
		Thread.sleep(3000);
		
		
	}

}
