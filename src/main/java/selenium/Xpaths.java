package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycarhelpline.com/");
		driver.findElement(By.xpath("//div[@id='bluemenu']/child::ul[1]/child::li[5]/child::a[1]")).click();
		Thread.sleep(2000L);
		/// up to down side Relative Xpath
		driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']//div[@class='innerpage-bodycontainer-left']//table[1]//img[1]")).click();
		
		///Down to up side Relative Xpath
		driver.findElement(By.xpath("//div[@id='header-container']/preceding-sibling::table[3]/preceding::img[5]")).click();
		
		// driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[@class='innerpage-bodycontainer-left']/child::div[1]/child::table[1]/descendant::img[1]")).click();

	}

}
