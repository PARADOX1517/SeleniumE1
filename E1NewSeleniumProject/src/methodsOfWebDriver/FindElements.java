package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(2000);
		
		
		 List<WebElement> bikesoptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
	   	for(int i =0; i<bikesoptions.size();i++)
		{
			Object ops = bikesoptions.get(i).getText();
			System.out.println(ops);
			Thread.sleep(2000);
		}
	    	for(WebElement we:bikesoptions)
	    	{
	    		String options =we.getText();
	    		System.out.println(options);
	    		Thread.sleep(2000);
	    	}

	}

}
