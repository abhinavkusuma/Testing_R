package selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad_TimeOut {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		driver.get("https://www.hyrtutorials.com/");
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoad Time : "+ duration.toMillis() + "Milli Seconds");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}