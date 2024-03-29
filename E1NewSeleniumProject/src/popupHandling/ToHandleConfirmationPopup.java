package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		//Alert confirmationAlert = driver.switchTo().alert();
		//Thread.sleep(2000);
		//confirmationAlert.accept();
	}

}
