package smokeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ulta.com/");
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
		driver.findElement(By.cssSelector("button[class='c374f5b8a c1085a438 ccdf87e4e cc02a3617 c24430f5c']")).click();
	}
}