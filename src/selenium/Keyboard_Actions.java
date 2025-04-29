package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[1]"))).click().keyDown(Keys.SHIFT).sendKeys("pen driver").build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[1]"))).click().sendKeys("iphone").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.BACK_SPACE).build().perform();
	}
}
