package MethodsOFWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		WebDriver	driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://zubaid1517/login.do");
		
		WebElement usntb = driver.findElement(By.name("username"));
		Dimension size = usntb.getSize();
        int height = size.getHeight();
        int width = size.getWidth();
        System.out.println("Height is :"+height);
        System.out.println("Width is :"+width);
	}	

}
