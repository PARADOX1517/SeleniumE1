package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/TextBox.html");
       
       Thread.sleep(2000);
       
       driver.findElement(By.tagName("input")).sendKeys("manager");
       
	}

}
