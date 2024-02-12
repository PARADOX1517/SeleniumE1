package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUndersatndOperationalMethods {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/MultiSelectDropDown.html");
		
		WebElement msdd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(msdd);

		boolean res = sel.isMultiple();
		System.out.println(res);
		
		System.out.println();
		//to get all the options from a drop down
		List<WebElement> list = sel.getOptions();
		for(int i=0;i<list.size();i++)
		{
			String op = list.get(i).getText();	
			System.out.println(op);
		}
		
		System.out.println();
		
           for(WebElement we:list)
           {
        	  String ops = we.getText();
        	  System.out.println(ops);
           }
	}

}
