package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Zubaid%20khan/OneDrive/Desktop/WebElement/MultiSelectDropDown.html");
		
		WebElement msdd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(msdd);
		
		WebElement elements = sel.getWrappedElement();
		String text = elements.getText();
		System.out.println(text);

	}

}
