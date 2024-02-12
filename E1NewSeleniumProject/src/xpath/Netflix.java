package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(5000);
		
		WebElement signin = driver.findElement(By.xpath("//a[text()='Sign In']"));
		signin.click();
		
		
		
		

	}

}
