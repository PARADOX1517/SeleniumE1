package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String pageSource=driver.getPageSource();
		
		System.out.println(pageSource);
		
		
	}

}
