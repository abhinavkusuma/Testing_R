package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin");
		highlight(driver,driver.findElement(By.tagName("h1")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.cssSelector("label[for=\"login_field\"]")));
		Thread.sleep(5000);
		driver.findElement(By.id("login_field")).sendKeys("Abhinav_123");
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.xpath("//label[@for=\"password\"]")));
		Thread.sleep(5000);
		driver.findElement(By.className("form-control form-control input-block js-password-field")).sendKeys("Abhinav");
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.name("commit")));
		highlight(driver,driver.findElement(By.className("Button-label")));
	}
	private static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:Orange')", element);
		
	}

}
