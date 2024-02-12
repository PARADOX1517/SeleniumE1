package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		
		 WebElement UnTB = driver.findElement(By.cssSelector("input[aria-label^='Pho']"));
		 UnTB.sendKeys("_____zubaid_k_15");
		 Thread.sleep(2000);
		 
		 WebElement passTB = driver.findElement(By.cssSelector("input[type$='rd']"));
		 passTB.sendKeys("Zubaid@1234");
		 Thread.sleep(2000);
		 
		 WebElement loginbtn = driver.findElement(By.cssSelector("button[type*='bm']"));
		 loginbtn.click();

	}

}
