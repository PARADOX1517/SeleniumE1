package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//to type cast from webdriver to javaScriptExecuter

		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-300,0)");
		
	}

}
