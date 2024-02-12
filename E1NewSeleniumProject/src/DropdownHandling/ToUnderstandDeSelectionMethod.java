package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDeSelectionMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/MultiSelectDropDown.html");
	
	WebElement msdd = driver.findElement(By.id("menu"));
	
	Select sel = new Select(msdd);
	
	sel.selectByIndex(4);
	Thread.sleep(3000);
	
//	sel.deselectByIndex(4);
	
//	sel.deselectByVisibleText("Paav Bhaji");
	
	sel.deselectByValue("V5");	
    
	}

}
