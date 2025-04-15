package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		highlight(driver,driver.findElement(By.tagName("img")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.className("_9axz")));
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abhinav@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Abhinav");
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.name("login")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.linkText("Forgotten account?")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.partialLinkText("Sign up for Facebook")));
	}

	private static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);

		
	}

}
