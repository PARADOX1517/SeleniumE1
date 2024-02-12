package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.xpath("//input[@name='q']"));
		click.sendKeys("Hp laptop");
		Thread.sleep(2000);
		
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();
		Thread.sleep(2000);
		
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
		brand.click();
		Thread.sleep(2000);
		
		WebElement Hp = driver.findElement(By.xpath("//div[text()='HP' and @class='_3879cV'] "));
		Hp.click();
		Thread.sleep(2000);
		
		WebElement core = driver.findElement(By.xpath("//div[text()='Core i5']"));
		core.click();
		Thread.sleep(2000);
		
		WebElement Os = driver.findElement(By.xpath("//div[text()='Operating System']"));
		Os.click();
		Thread.sleep(2000);
		
		WebElement w10 = driver.findElement(By.xpath("//div[text()='Windows 10' ]"));
		w10.click();
		Thread.sleep(2000);
		
		
		List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> laptopPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i =0;i<laptop.size();i++)
		{
		  String lap = laptop.get(i).getText();
		  
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
