package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JS\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
		// int i=1;

	
	// while (i<5)
	// {
	// 	driver.findElement(By.id("hrefIncAdt")).click();//4 time
	// 	i++;
	// }
	// 	driver.findElement(By.id("btnclosepaxoption")).click();
	// }



// we can run this code with for and while loop

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
for(int i=1;i<5;i++) 
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
	driver.findElement(By.id("btnclosepaxoption")).click();

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
