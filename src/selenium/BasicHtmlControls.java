package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicHtmlControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindichk = driver.findElement(By.id("hindichbx"));
		hindichk.click(); 
		if(hindichk.isSelected()) {
			hindichk.click();
			Thread.sleep(3000);
			driver.findElement(By.id("registerbtn")).click();
			System.out.println(driver.findElement(By.id("msg")).getText());
			Thread.sleep(3000);
			driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		}
	}
}