package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Files_Upload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\91934\\OneDrive\\Pictures\\Saved Pictures\\img.jpg");
		
		// With in the Package How to Upload File 
//		String projectPath = System.getProperty("user.dir");
//		driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"\\Pics\\img.jpg");
	}
}