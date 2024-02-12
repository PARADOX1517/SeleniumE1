package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver =new ChromeDriver();
    Thread.sleep(2000);
    
    //driver.manage().window().maximize();
    Options ops = driver.manage();
    Window wi = ops.window();
    wi.maximize();
    driver.get("https://omayo.blogspot.com/");
    
    driver.findElement(By.linkText("Open a popup window")).click();
    
    Thread.sleep(2000);
    
    driver.quit();
    
	}

}
