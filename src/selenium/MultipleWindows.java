package selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("name")).sendKeys("Abhinav");
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle:windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);	
			}
		}		driver.findElement(By.name("lName")).sendKeys("Abhinav");
	}

}
