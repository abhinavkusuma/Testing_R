package basic_Programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Speed_X {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
		driver.get("https://pagespeed.web.dev/");
		driver.findElement(By.xpath("//input[@id='i2']")).sendKeys("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 c659ib']")).click();		
		Thread.sleep(2000);
		String mobile = driver.findElement(By.xpath("(//div[@class=\"lh-exp-gauge__svg-wrapper\"])[1]")).getText();
		System.out.println("Diagnose performance issues of Mobile "+mobile);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='desktop_tab']//span[@class='VfPpkd-YVzG2b']")).click();		
		String desktop = driver.findElement(By.xpath("(//*[name()='text'])[13]")).getText();
		System.out.println("Diagnose performance issues of Desktop "+desktop);
	}
}