package MethodsOFWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zubaid1517/login.do");
		
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		String cssValue = loginBtn.getCssValue("background");
       System.out.println(cssValue); 
	}

}
