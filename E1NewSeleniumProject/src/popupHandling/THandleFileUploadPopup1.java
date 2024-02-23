package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class THandleFileUploadPopup1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
	    WebElement fileupload = driver.findElement(By.id("uploadfile"));
	    act.click(fileupload).perform();
	    
	    Thread.sleep(2000);
	    
	    Runtime.getRuntime().exec("./autoItPrograms/file_Upload.exe");
	   
	}

}
