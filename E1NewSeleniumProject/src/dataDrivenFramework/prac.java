package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("http://zubaid1517/login.do");
		    
		    Flib flib = new Flib();
		   for(int i=1;i<=4;i++)
		   {
		    String usnData = flib.readExcelData("./data/TestData.xlsx","invalidcreds" ,i, 0);
		    String pwdData = flib.readExcelData("./data/TestData.xlsx","invalidcreds", i, 1);
		    
		    driver.findElement(By.name("username")).sendKeys(usnData);
		    Thread.sleep(1000);
		    driver.findElement(By.name("pwd")).sendKeys(pwdData);
		    Thread.sleep(1000);
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("username")).clear();
		    
		   }

	}

}
