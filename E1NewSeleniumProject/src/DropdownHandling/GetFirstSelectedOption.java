package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/MultiSelectDropDown.html");
		
		WebElement msdd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(msdd);
		
		for(int i =2;i<=4;i++)
		{
			sel.selectByIndex(i);
			
		}
         WebElement firstop = sel.getFirstSelectedOption();
        String firstText = firstop.getText();
         System.out.println(firstText);
	}

}
