package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandSelection {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/DropDown.html");
	
	WebElement singleSelect = driver.findElement(By.id("menu"));
	
	Select sel = new Select(singleSelect);
	//To select an option using the index
	sel.selectByIndex(4);
	Thread.sleep(5000);
	
	//To select an option by using the value of the option
	sel.selectByValue("V4");
	Thread.sleep(2000);
	
	//To select an option by using the Text of the option
	sel.selectByVisibleText("Samosa");
	Thread.sleep(3000);

	}

}
