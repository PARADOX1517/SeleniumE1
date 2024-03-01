package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingNameOrId {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver	driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://www.dream11.com/");
		  
		    Thread.sleep(2000);
		   driver.switchTo().frame("send-sms-iframe");
		   driver.findElement(By.id("regEmail")).sendKeys("9876541230");

	}

}
