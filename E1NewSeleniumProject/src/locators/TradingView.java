package locators;

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
		
	}

}
