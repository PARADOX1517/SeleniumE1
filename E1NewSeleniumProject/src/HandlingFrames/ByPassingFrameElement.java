package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingFrameElement {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver	driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://www.dream11.com/");
		  
		    Thread.sleep(2000);
		    
		    // to find the frame by writing xpath
		    WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		   //to pass the reference to the frame
		    driver.switchTo().frame(frameElement);
		  //to perform operation on element designed inside frame
		    driver.findElement(By.id("regEmail")).sendKeys("9876541230");

	}

}
