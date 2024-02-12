package Assignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartBYsync {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement click = driver.findElement(By.xpath("//input[@name='q']"));
		click.sendKeys("Hp laptop");
		
		
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();
		
		
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
		brand.click();
		
		
		 driver.findElement(By.xpath("//div[text()='HP' and @class='_3879cV'] ")).click();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click(); 
		 
	 	 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		 
		 
		 driver.findElement(By.xpath("//div[text()='Windows 10' ]")).click();
		
		 List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		 List<WebElement> laptopPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i =0;i<laptop.size();i++)
		{
		  String lap = laptop.get(i).getText();
		  Thread.sleep(1000);
		  
		  for(int n=i;n<=i;n++)
		  {
			 String pri = laptopPrice.get(i).getText();
			 System.out.println(lap+"....."+pri);
			 System.out.println(""); 
		  }
			  
		}
		
		driver.close();
		
	}

}
