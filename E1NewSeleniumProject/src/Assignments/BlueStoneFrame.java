package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("fc_widget");
	    driver.findElement(By.id("chat-icon")).click();
	    
	    driver.switchTo().parentFrame();
	    driver.findElement(By.id("chat-fc-name")).sendKeys("zubaid");
	}
	

}
