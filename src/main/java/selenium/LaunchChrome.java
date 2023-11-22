package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchChrome {

	public static void main(String[] args) {
		// chromedriver.exe -->> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		//webdriver.chrome.driver->value of path
		
		//Firefox Launch
		//geckodriver
		
		//webdriver.gecko.driver
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\JS\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		
//		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.crickbuzz.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
		
				

	}

}
