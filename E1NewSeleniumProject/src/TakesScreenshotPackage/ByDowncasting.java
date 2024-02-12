package TakesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncasting {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/Flipkart.jpeg");
		
		Files.copy(src, dest);
		
		
		

	}

}
