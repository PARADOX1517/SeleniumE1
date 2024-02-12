package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		WebElement emailTextbox = driver.findElement(By.name("email"));
		emailTextbox.sendKeys("7843039791");
		Thread.sleep(2000);
       
		WebElement passTextbox = driver.findElement(By.name("pass"));
		passTextbox.sendKeys("ZAHIDKHAN"); 
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
	}

}
