package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBsignUp {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yearDD = driver.findElement(By.id("year"));
		
    	Select dayDropdown = new Select(dayDD);
    	boolean result1 = dayDropdown.isMultiple();
    	System.out.println("Day DropDown is Multiple Dropdown"+" "+result1);
		List<WebElement> option = dayDropdown.getOptions();
		dayDropdown.selectByVisibleText("15");
		for(WebElement we :option)
		{
			String day = we.getText();
			System.out.println(day);
		}
		
		System.out.println("-----------------------------------------------");
		
		Select monthDropDown = new Select(monthDD);
		boolean result2 = monthDropDown.isMultiple();
		List<WebElement> options2 = monthDropDown.getOptions();
		System.out.println("Month dropdown is Multiple DropDown"+" "+result2);
		monthDropDown.selectByVisibleText("Jan");
		
		for(WebElement we :options2 )
		{
		 System.out.println(we.getText());	
		}
		
		System.out.println("-------------------------------------------------");
		
		Select yeardropdown = new Select(yearDD);
		boolean result3 = yeardropdown.isMultiple();
		System.out.println("Year dropdown is Multiple Dropdown"+" "+result3);
		yeardropdown.selectByVisibleText("2002");
		List<WebElement> options3 = yeardropdown.getOptions();
		for(WebElement we: options3)
		{
		System.out.println(we.getText());	
		}
	}

}
