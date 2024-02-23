package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandWindowHandles {

	public static void main(String[] args) {
    WebDriver	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://omayo.blogspot.com/");
    
    
   String parentWindow = driver.getWindowHandle();
   System.out.println(parentWindow);
   
    String parentTitle = driver.getTitle();
   
    driver.findElement(By.partialLinkText("Open a popup window")).click();
   Set<String> allWindows = driver.getWindowHandles();
   
     for (String all : allWindows) 
     {
    	
    	String title = driver.switchTo().window(all).getTitle();
    	
    	if (!title.equals(parentTitle)) 
    	{
			driver.close();
		}
		
	 }
   
}

}
