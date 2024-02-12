package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Point targetPoint=new Point(300, 200);//To Pass x and Y co-ordinates
		
		driver.manage().window().setPosition(targetPoint);//To pass the co-ordinates to setPosition Method
	}

}
