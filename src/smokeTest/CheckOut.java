package smokeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		driver.findElement(By.id("213e8764-0133-417b-9ae6-a3dc2d4805c8")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--primary pal-c-Link--default\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span [@class=\"Text-ds Text-ds--body-2 Text-ds--center Text-ds--black\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--compact\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class=\"pal-c-Link pal-c-Link--buttonPrimary pal-c-Link--compact\"]")).click();		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default CartActions__CheckoutButton\"]")).click();
	}
}