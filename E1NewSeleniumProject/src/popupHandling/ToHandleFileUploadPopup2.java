package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//To upload file in the W3school upload file option		
		
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions act = new Actions(driver);
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.id("myFile"));
		act.click(btn).perform();
		
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("./autoItPrograms/demoappFileUpload.exe");*/
		
//-----------------------------------------------------------------------------------------------
		//to upload file the demo apps upload file
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions act = new Actions(driver);
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.id("fileInput"));
		act.click(btn).perform();
		
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("./autoItPrograms/demoappFileUpload.exe");
		

	}

}
