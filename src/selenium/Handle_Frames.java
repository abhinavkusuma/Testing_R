package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Abhinav"); // Main Document
		Thread.sleep(4000);
		driver.switchTo().frame("frm1"); //Frame 1
		Thread.sleep(4000);
		Select courseName = new Select(driver.findElement(By.id("course")));
		courseName.selectByVisibleText("Java");
		driver.switchTo().defaultContent(); // Main Document
		driver.findElement(By.id("name")).clear();
		Thread.sleep(4000);	
		driver.findElement(By.id("name")).sendKeys("Kusuma");
		driver.switchTo().frame("frm2"); //Frame 2
		driver.findElement(By.id("firstName")).sendKeys("Kusuma");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm1"); //Frame 1
		Thread.sleep(4000);
		courseName.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent(); // Main Document
		driver.findElement(By.id("name")).clear();
		Thread.sleep(4000);
		driver.findElement(By.id("name")).sendKeys("Kusuma");
	}
}