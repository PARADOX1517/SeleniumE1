package Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yantra {

	public static void main(String[] args) {
		
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");	
	
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.yatra.com/");
	
	

	}
}
