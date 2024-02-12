package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();//launch the browser
       driver.manage().window().maximize();
       
       driver.navigate().to("https://www.flipkart.com/");// TO Launch the Web application
       
       Thread.sleep(1000);
       
     //  driver.navigate().back();// to navigate Backward
      Navigation nav = driver.navigate();
      nav.back();
       Thread.sleep(1000);
       
       driver.navigate().forward();//  to Navigate forward
       
       Thread.sleep(1000);
       
       driver.navigate().refresh();  // to refresh 
	}

}
