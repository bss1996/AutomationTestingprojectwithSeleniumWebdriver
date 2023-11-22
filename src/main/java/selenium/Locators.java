package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//to-do Auto-generated method stub
		//implicit wait -2 seconds time out
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/nlogin/login");
		// driver.findElement(By.id("usernameField")).sendKeys("shekhawat.bs13@gmail.com");
		// driver.findElement(By.id("passwordField")).sendKeys("Nandu9784");
		// driver.findElement(By.className("blue-btn")).click();
		// System.out.println(driver.findElement(By.cssSelector("//span[@class='col s12 commonErrorMsg']")).getText());
		driver.findElement(By.linkText("Forgot Password?")).click();
		System.out.println();driver.findElement(By.xpath("(//input[@id='usernameField'])[1]")).sendKeys("shekhawat.bs13@gmail.com");
		driver.findElement(By.cssSelector("button[class='inline-items waves-effect waves-light btn blue-btn']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Sign in with Google']")).click();
	}

}
