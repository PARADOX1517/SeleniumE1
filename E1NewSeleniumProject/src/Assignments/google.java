package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class google {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app");
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(5000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshots/maps.png");
	    Files.copy(src, dest);
		
	    
	    driver.navigate().back();

	}

}
