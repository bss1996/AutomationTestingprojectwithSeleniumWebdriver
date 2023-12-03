package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;

	public LoginPage loginpg;
	@Given("User Has Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpg= new LoginPage(driver);

	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		loginpg.enterEmail(email);
		loginpg.enterPassword(password);
	    
	}

	
	@When("Click on Login button")
	public void click_on_login_button() {
		loginpg.clickOnLoginButton();
	}
}




