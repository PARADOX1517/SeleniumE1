package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
	    driver.findElement(By.xpath("//section[text()='Button']")).click();
		
	    driver.findElement(By.partialLinkText("Double Click")).click();
		
		
		WebElement yesbtn1 = driver.findElement(By.id("btn20"));
		WebElement noBtn2 = driver.findElement(By.id("btn23"));
		WebElement ratingBtn = driver.findElement(By.id("btn26"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(yesbtn1).perform();
		
		act.doubleClick(noBtn2).perform();
		
		act.doubleClick(ratingBtn).perform();
		

	}

}
