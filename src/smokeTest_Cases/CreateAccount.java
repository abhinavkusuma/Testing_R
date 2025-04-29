package smokeTest_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500);");		
		driver.findElement(By.xpath("//p[@class='c53c6f72a cd0e583bc cf991a62f']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Akshay");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		Thread.sleep(3000);
		driver.findElement(By.id("phoneNumber")).sendKeys("1534534544");
		Thread.sleep(3000);
		WebElement states = driver.findElement(By.id("province"));
		Select statesNames = new Select(states);
		statesNames.selectByValue("AE");
		driver.findElement(By.id("email")).sendKeys("akshaykumar@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("label[for=\"ulp-emailOptIn\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ulp-emailOptIn"));
		Thread.sleep(3000);
//		driver.findElement(By.id("YES")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[id=\"ulp-stay-signed-in\"]")).click();
//		Thread.sleep(3000);
//		js.executeScript("window.scroll(0,500);");	
		driver.findElement(By.xpath("//button[@class=\"c374f5b8a c1085a438 ccdf87e4e cc02a3617 cf8c67dfe\"]")).click();
//		driver.findElement(By.className("class=\"pal-c-Link pal-c-Link--primary pal-c-Link--default\"")).click();
	}
}