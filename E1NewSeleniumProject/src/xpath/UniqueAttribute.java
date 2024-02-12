package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(8000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("zubaidkhan1517@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='mui-2']"));
		pass.sendKeys("Zahid@123");
		Thread.sleep(2000);
		
		WebElement signinbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		signinbtn.click();
		

	}

}
