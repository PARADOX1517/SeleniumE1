package TakesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemoteDriver {
  public static void main(String[] args) throws IOException, InterruptedException {
	
	  RemoteWebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/amazon.jpg");
		
		Files.copy(src, dest);
		
}
}
