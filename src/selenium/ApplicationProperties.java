package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationProperties {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		
		// URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL - "+currentUrl);
		
		//Title
		String title = driver.getTitle();
		System.out.println("Title - "+title);
		
		//PageSource
		String pageSource = driver.getPageSource();
		System.out.println("pageSource - "+pageSource);
	}

}
