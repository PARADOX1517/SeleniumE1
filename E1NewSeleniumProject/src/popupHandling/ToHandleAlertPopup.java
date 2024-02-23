package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("https://omayo.blogspot.com/");
		
		//to generate alert Popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		//To switch control to the Alert popup
		Alert alertPopup = driver.switchTo().alert();
		
	//    To click on Ok Button
		alertPopup.accept();
		
		 alertPopup.dismiss();

	}

}
