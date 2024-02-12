package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Actions act = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		act.click(button).perform();//To perform a single click using click method of Action Class
		WebElement rightclick = driver.findElement(By.partialLinkText("Right Click"));
		act.click(rightclick).perform();//To perform a single click using click method of Action Class
		
		WebElement Button1 = driver.findElement(By.id("btn30"));
		act.contextClick(Button1).perform();//To perform a right click using contextClick method of Action Class
		WebElement button1ops = driver.findElement(By.xpath("//div[text()='Yes']"));
		act.click(button1ops).perform();//To perform a single click using click method of Action Class
		
		WebElement Button2 = driver.findElement(By.id("btn31"));
		act.contextClick(Button2).perform();//To perform a right click using contextClick method of Action Class
		WebElement button2ops = driver.findElement(By.xpath("//div[text()='No']"));
		act.click(button2ops).perform();//To perform a single click using click method of Action Class
		
		WebElement Button3 = driver.findElement(By.id("btn32"));
		act.contextClick(Button3).perform();//To perform a right click using contextClick method of Action Class
		WebElement button3option = driver.findElement(By.xpath("//div[text()='5']"));
		act.click(button3option).perform();//To perform a single click using click method of Action Class
       
	}

}
