package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		// Absolute Xpath
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/a[3]")).click();
//		Thread.sleep(5000);
		// Relative XPath
//		driver.findElement(By.xpath("//a[@id=\"navbtn_certified\"]")).click();
//		Thread.sleep(5000);
		// Xpath Operators
		// For And Condition 2 Conditions Must Be True Then it won't get Error
		driver.findElement(By.xpath("//input[@name=\"refreshbtn\" and @value=\"Refresh\"]")).click();
		// For OR Condition if one condition is True it will execute
		driver.findElement(By.xpath("//input[@name=\"refreshbtn\" or @value=\"Refresh\"]")).click();
		// For Contains Partial Text if we mention in Order it will give the result 
		driver.findElement(By.xpath("//a[contains(text(),'Sign in into')]")).click();
		// for Text we have to give proper text or else it won't give the Result
		driver.findElement(By.xpath("//a[text()='Sign in into account']")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in in')]")).click();
		driver.findElement(By.xpath("//label[normalize-space(text())='First Name'] ")).click();
		driver.quit();
	}
}