package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath = "//input[@id='usernameField']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='passwordField']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login;
	
//	@FindBy(linkText="Logout")
//	WebElement logout;
	
	public void enterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void enterPassword(String password)
	{
		email.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		Login.click();
	}
	
//	public void clickOnLogOutButton()
//	{
//		logout.click();
//	}
	
}
