package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2withTageName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("usernameField")).sendKeys("shekhawat.bs13@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Nandu9784");
		driver.findElement(By.className("blue-btn")).click();
		driver.findElement(By.tagName("null"));


	}

}
