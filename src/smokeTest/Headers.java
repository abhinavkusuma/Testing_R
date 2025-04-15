package smokeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
//		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='c374f5b8a c1085a438 ccdf87e4e cc02a3617 cbb792e2c']")).click();
//		Thread.sleep(5000);
		driver.findElement(By.className("pal-c-Button__text")).click();
//		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--unstyled pal-c-Button--default pal-c-Button--fullWidth NavigationLinksGroup__button NavigationLinksGroup__Hair_Care\"]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--arrow pal-c-Link__style--title\"])[3]")).click();
//		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
//		Thread.sleep(5000);
		driver.findElement(By.id("10f1c7e0-57d5-4ec8-821d-90ceab71dd2d")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h2[@class=\"Text-ds Text-ds--title-6 Text-ds--left Text-ds--black\"])[1]")).click();
//		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
//		Thread.sleep(5000);
		driver.findElement(By.id("213e8764-0133-417b-9ae6-a3dc2d4805c8")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--primary pal-c-Link--default\"])[2]")).click();
		driver.navigate().back();
		driver.navigate().back();
//		Thread.sleep(5000);
		driver.findElement(By.id("[id=\"7cf31e5e-ca8c-4b01-8a5d-6473f6b35530\"]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--primary pal-c-Link--default\"])[2]")).click();
//		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.id("ea266b4a-98d6-413e-bda8-a43d2f2d07b5")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--primary pal-c-Link--default\"])[2]")).click();
//		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.id("eb3bb69a-901f-42f6-ac3b-715b27dd6db9")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--primary pal-c-Link--default\"])[2]")).click();
//		Thread.sleep(5000);
		driver.navigate().back();
	}
}