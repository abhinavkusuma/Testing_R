package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = (WebElement) js.executeScript("return document.getElementById('email');");
		element.sendKeys("abhinavabhi337@gmail.com");
		
		js.executeScript("document.getElementById(\"email\").value=\"Abhinav\"");
		js.executeScript("document.getElementById(\"email\").style.border=\"10px red solid\";");
		js.executeScript("document.getElementById(\"email\").style.background= \"yellow\";");
		js.executeScript("document.getElementById(\"email\").setAttribute(\"style\",\"border:5px red solid; background:yellow\");");
		
//		driver.get("https://www.hyrtutorials.com/");
//		js.executeScript("window.scroll(0,500);");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollTo(0,200);");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollTo(0,500);");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementById(\"ty_footer\").scrollIntoView();");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollTo(0,500);");
	}
}