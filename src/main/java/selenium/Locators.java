package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait -2 seconds time out
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\JS\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\JS\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get("https://www.naukri.com/nlogin/login");
		// driver.findElement(By.className("input[placeholder='Enter your active Email ID / Username']")).sendKeys("shekhawat.bs13@gmail.com");
		// driver.findElement(By.className("input[placeholder='Enter your password']")).sendKeys("Nandu!9784");
		
		// driver.get("https://www.naukri.com/nlogin/login");
		driver.get("https://www.naukri.com/");
		driver.findElement(By.className("nI-gNb-lg-rg__login")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("shekhawat.bs13@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Nandu!9784");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("a[title='Recommended Jobs'] div")).click();
		// driver.findElement(By.className("nI-gNb-drawer__icon")).click();
		// driver.findElement(By.id("usernameField")).sendKeys("shekhawat.bs13@gmail.com");
		// driver.findElement(By.id("passwordField")).sendKeys("Nandu!9784");
		// driver.findElement(By.className("button[type='submit']")).click();
		// driver.findElement(By.className("blue-btn")).click();
		// System.out.println(driver.findElement(By.cssSelector("//span[@class='col s12 commonErrorMsg']")).getText());
		// driver.findElement(By.linkText("Forgot Password?")).click();
		// System.out.println();driver.findElement(By.xpath("(//input[@id='usernameField'])[1]")).sendKeys("singh");
		// driver.findElement(By.cssSelector(".nI-gNb-drawer__bars")).click();
		// driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
		

	}



}
