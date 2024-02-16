package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		
		Thread.sleep(1000);
		
		
		WebElement coins = driver.findElement(By.id("goldCoins"));
		
		act.moveToElement(coins).perform();
		
	   driver.findElement(By.xpath("(//span[text()='1 gram'])[1]")).click();
	    
		Thread.sleep(1000);

		
		WebElement coinimg = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src = coinimg.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/gold1.png");
		
		Files.copy(src, dest);
		
		System.out.println("Gold coin image is displayed ="+coinimg.isDisplayed());
	}

}
