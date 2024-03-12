package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement pwdTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(name="remember") private WebElement rememberMeCheckbox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actimindLink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsnTB()
	{
		return usnTB;
	}

	public WebElement getPwdTB() {
		return pwdTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}

	public WebElement getActimindLink() {
		return actimindLink;
	}
	
	public void validLoginMethod(String username,String password) throws InterruptedException
	{
		usnTB.sendKeys(username);
		Thread.sleep(2000);
		pwdTB.sendKeys(password);
		Thread.sleep(2000);
		loginButton.click();
	}
	
	public void invalidLoginMethod(String username,String password) throws InterruptedException
	{
		usnTB.sendKeys(username);
		Thread.sleep(2000);
		pwdTB.sendKeys(password);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();

	}

}
