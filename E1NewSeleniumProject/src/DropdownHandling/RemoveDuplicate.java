package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/MultiSelectDropDown.html");
		
		WebElement msdd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(msdd);
		//Remove the duplicates from the dropdown
		TreeSet<String> ts = new TreeSet<String>();
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement we : options)
		{
			String text = we.getText();
			ts.add(text);
			
		}
          System.out.println(ts);
          
          for(String t: ts)
          {
        	  System.out.println(t);
          }
          
	}

}
