package MethodsOFWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zubaid1517/login.do");
		
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		Point point = loginBtn.getLocation();
		System.out.println(point.getX());
        System.out.println(point.getY());
	}

}
