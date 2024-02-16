package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("https://www.facebook.com/signup");
		
		WebElement hiddenEle = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//to type cast from webdriver to javaScriptExecuter
     
		 js.executeScript("arguments[0].value='male'",hiddenEle);
	}

}
