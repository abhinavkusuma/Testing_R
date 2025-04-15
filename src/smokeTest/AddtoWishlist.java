package smokeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoWishlist {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--unstyled pal-c-Button--default pal-c-Button--iconOnly Nudge__close\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"SearchDesktop\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("Skin Rewind Complexion");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark']//*[name()='svg']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class=\"SearchDesktop\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("Cashmere Matte Eyelights");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Submit']//*[name()='svg']//*[name()='path' and contains(@d,'M11.9441 1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@aria-label=\"View your favorites\"]")).click();
	}
}