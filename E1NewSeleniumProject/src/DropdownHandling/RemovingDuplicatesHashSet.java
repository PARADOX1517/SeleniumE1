package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicatesHashSet {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/MultiSelectDropDown.html");
		
		WebElement msdd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(msdd);
		HashSet<String> Hs = new HashSet<String>();
		List<WebElement> options = sel.getOptions();
		
		for(int n =0;n< options.size();n++)
		{
			String text = options.get(n).getText(); 
			Hs.add(text);
		}
		for(String s:Hs)
		{
		System.out.println(s);
		}
	}

}
