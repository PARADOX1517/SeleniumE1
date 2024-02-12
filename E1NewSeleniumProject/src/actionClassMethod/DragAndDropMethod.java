package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		//mobile and laptop source elements
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement LaptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//Mobile and Laptop Target Element
		WebElement LaptopAcces = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement MobileAcces = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
       
		Actions act = new Actions(driver);//Create the object of the action  class
        
		//drag and drop the webElements into the respective target area
		
        act.dragAndDrop(mobileCharger,MobileAcces ).perform();
        Thread.sleep(1000);
        act.dragAndDrop(mobilecover, MobileAcces).perform();
        Thread.sleep(1000);
        act.dragAndDrop(LaptopCharger, LaptopAcces).perform();
        Thread.sleep(1000);
        act.dragAndDrop(LaptopCover,LaptopAcces).perform();
        Thread.sleep(1000);
        driver.close();
	}

}
