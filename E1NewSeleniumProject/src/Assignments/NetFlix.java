package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlix {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	 driver.get("https://www.netflix.com/in/");
	 
	WebElement email = driver.findElement(By.name("email"));
	
	email.sendKeys("zubaidkhan1517@gmail.com");
	Thread.sleep(2000);
	WebElement button=driver.findElement(By.tagName("button"));
	button.click();
	Thread.sleep(2000);
	WebElement pass= driver.findElement(By.id("id_password"));
	pass.sendKeys("Zubaid@123");
	
	Thread.sleep(2000);
	
	WebElement button2=driver.findElement(By.tagName("button"));
	button2.click();
	Thread.sleep(2000);
	WebElement Enteremail = driver.findElement(By.id("id_email"));
    Enteremail.sendKeys("zubaidkhan1517@gmail.com");
	}

}
