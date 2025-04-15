package smokeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("399969a2-bbcd-48c9-9e61-18fddcb1c88c")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--unstyled pal-c-Button--default pal-c-Button--fullWidth NavigationLinksGroup__button NavigationLinksGroup__Skin_Care\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class=\"pal-c-Link pal-c-Link--arrow pal-c-Link__style--title\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--center Text-ds--black\"])[3]")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--center Text-ds--black\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--compact\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--compact\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.ulta.com/']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"SearchL__searchIcon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"PrimaryBar__logo__image\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("SearchHeader")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("Cashmera Matte Eyelights");
		Thread.sleep(3000);
		driver.findElement(By.className("InputFieldUnderline__ArrowForward")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='AddToBagFavorite__AddToBag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("pal-c-Link pal-c-Link--buttonPrimary pal-c-Link--compact")).click();
		
//		driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
//		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--unstyled pal-c-Button--default pal-c-Button--iconOnly Nudge__close\"]")).click();
//		driver.findElement(By.xpath("//div[@class='SearchDesktop']")).click();
//		driver.findElement(By.id("search")).sendKeys("Cashmera Matte Eyelights");
//		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly\"]")).click();
//		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default AddToBagButton__AddToBag\"]")).click();
//		driver.navigate().back();
	}
}