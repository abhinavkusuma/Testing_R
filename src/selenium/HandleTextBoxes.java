package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("login_field"));
		if (username.isDisplayed()){
			if (username.isEnabled()) {
				username.sendKeys("Abhinav");
				Thread.sleep(3000);
				String enteredText = username.getAttribute("value");
				System.out.println(enteredText);
				Thread.sleep(3000);
//				usernameTxt.clear();
//				Thread.sleep(3000);
				username.sendKeys(" Kusuma");
				Thread.sleep(3000);
				username.clear();
			}
			else {
				System.err.println("username box is not enable");
			}
		} 
		else {
			System.err.println("username box is not displayed");
		}
		
		
//		WebElement password = driver.findElement(By.id("password"));
//		if (password.isDisplayed()){
//			if (password.isEnabled()) {
//				password.sendKeys("Abhinav");
//				Thread.sleep(3000);
//				String enteredText = password.getAttribute("value");
//				System.out.println(enteredText);
//				Thread.sleep(3000);
//				password.clear();
//				Thread.sleep(3000);
//				password.sendKeys(" Kusuma");
//				Thread.sleep(3000);
//				password.clear();
//			}
//			else {
//				System.err.println("password box is not enable");
//			}
//		}
//		else {
//			System.err.println("password box is not displayed");
//		}
	}
	
}
