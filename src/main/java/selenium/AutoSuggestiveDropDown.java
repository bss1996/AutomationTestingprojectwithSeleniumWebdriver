package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\JS\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options= driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;

			}
				
		}
	}

}

