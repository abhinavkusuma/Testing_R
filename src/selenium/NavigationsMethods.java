package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("help@gmail.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
	}

}
