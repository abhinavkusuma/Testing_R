package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// import jakarta.enterprise.inject.build.compatible.spi.BuildCompatibleExtension;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
//		driver.get("https://www.sketch.com/");
//		Thread.sleep(3000);
//		a
//		.moveToElement(driver.findElement(By.xpath("(//li[@class=\"main-nav__item main-nav__subnav\"])[2]")))
//		.moveToElement(driver.findElement(By.xpath("(//li[@class=\"main-nav__subnav__item\"])[7]")))
//		.click()
//		.perform();
		
		// Right Click Operation
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		a.contextClick(driver.findElement(By.xpath("(//span[.='right click me'])"))).perform();
//		driver.findElement(By.xpath("(//span[.='Edit'])")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		// Drag and Drop
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement w = driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]"));
		driver.switchTo().frame(w);
		a.dragAndDrop(driver.findElement(By.xpath("(//div[@id=\"draggable\"])")), driver.findElement(By.xpath("(//div[@id=\"droppable\"])"))).build().perform();
	}
}