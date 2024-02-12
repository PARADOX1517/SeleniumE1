package Assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloAssingment {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Actions act = new Actions(driver);
	
	driver.get("https://trello.com/home");
	driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
	//To login into trello
	driver.findElement(By.id("username")).sendKeys("zubaidkhan1517@gmail.com");
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	driver.findElement(By.id("password")).sendKeys("Zubaid@123");
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	//to select the board
	driver.findElement(By.xpath("(//div[text()='Mocks'])[1]")).click();
	Thread.sleep(3000);
	
	//finding the element to drag
	WebElement sql = driver.findElement(By.xpath("//a[text()='SQL']"));
	WebElement java = driver.findElement(By.xpath("//a[text()='JAVA']"));
	WebElement manualTesting = driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
	WebElement api = driver.findElement(By.xpath("//a[text()='API']"));
	WebElement selenium = driver.findElement(By.xpath("//a[text()='SELENIUM']"));
	
	Thread.sleep(1000);
	//find the target to drag  webElement
	WebElement mockgiven = driver.findElement(By.xpath("(//button[@data-testid='list-add-card-button'])[2]"));
	WebElement mockPending = driver.findElement(By.xpath("//h2[text()='MOCK PENDING']"));
	WebElement mockSchedule = driver.findElement(By.xpath("//h2[text()='MOCK SCHEDULE']"));
	Thread.sleep(1000);
	
	//drag the element to the target
	Actions drag1 = act.dragAndDrop(sql, mockgiven);	
	Thread.sleep(1000);
	drag1.perform();
	
	Actions drag2 = act.dragAndDrop(java, mockgiven);
	Thread.sleep(1000);
	drag2.perform();
	
	Actions drag3 = act.dragAndDrop(manualTesting, mockgiven);
	Thread.sleep(1000);
	drag3.perform();
	
	Actions drag4 = act.dragAndDrop(api, mockSchedule);
	Thread.sleep(1000);
	drag4.perform();
	
	Actions drag5 = act.dragAndDrop(selenium, mockPending);
	Thread.sleep(1000);
	drag5.perform();
	
	Thread.sleep(2000);
    
	//print the edit options
	WebElement sqlele = driver.findElement(By.xpath("//a[text()='SQL']"));
	act.contextClick(sqlele).perform();
	Thread.sleep(1000);
	
	List<WebElement> options = driver.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
	for(WebElement we : options)
	{
		String text = we.getText();
		System.out.println(text);
	}
	
	}

}
