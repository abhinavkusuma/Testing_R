package smokeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Compare_Pdp_Plp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.100percentpure.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		driver.findElement(By.id("see-all-hyperlink")).click();
		String x = driver.findElement(By.xpath("//article[@class='whole-site product-item grid-item-33']//span[@class='original_price']//span[@class='money'][normalize-space()='$7.00']")).getText();
		System.out.println("x = "+x);
		driver.findElement(By.xpath("//article[@class='whole-site product-item grid-item-33']//img[@alt='deep-hydration-sheet-mask']")).click();
		String y = driver.findElement(By.id("product-price")).getText();
		System.out.println("y = "+y);
		if (x.equals(y)) {
			System.out.println("x is Equal to y");
		}else {
			System.out.println("x is Not Equal to y");
		}
	}
}