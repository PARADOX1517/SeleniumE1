package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		WebElement disabledEle = driver.findElement(By.id("name"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//to type cast from webdriver to javaScriptExecuter
 
		js.executeScript("document.getElementById('name').value='Admin'");
		
		
	}

}
