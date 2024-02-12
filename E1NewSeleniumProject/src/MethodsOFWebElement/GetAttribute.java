package MethodsOFWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zubaid1517/login.do");
		
		WebElement passTb = driver.findElement(By.name("pwd"));
		System.out.println(passTb.getAttribute("class")); 
		

	}

}
