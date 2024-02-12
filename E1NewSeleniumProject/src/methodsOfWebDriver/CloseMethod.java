package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();// TO Launch the CHrome Browser
       Thread.sleep(5000); // To Stop The Execution
       driver.close();  // To Close The Browser window
	}

}
