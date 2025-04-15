package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseDropDowns {

//	private static final String Selectedvalue = "india";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement countries = driver.findElement(By.id("country"));
		Select countryNames = new Select(countries);
		countryNames.selectByValue("india");
		Thread.sleep(3000);
		countryNames.selectByIndex(1);
		Thread.sleep(3000);
		countryNames.selectByVisibleText("Australia");
		List<WebElement> countryOptions = countryNames.getOptions();
		for (WebElement Options : countryOptions) {
			System.out.println(Options.getText());
		}
		String SelectedText = countryNames.getFirstSelectedOption().getText();
		System.out.println("Selected by Value "+SelectedText);
		
		
		
//		WebElement colors = driver.findElement(By.id("colors"));
//		Select colorsNames = new Select(colors);
//		colorsNames.selectByIndex(2);
//		colorsNames.selectByValue("red");
//		colorsNames.selectByVisibleText("Green");
//		List<WebElement> colorsOptions = colorsNames.getOptions();
//		for (WebElement Options : colorsOptions) {
//			System.out.println(Options.getText());
//		}
//		String SelectedText = colorsNames.getFirstSelectedOption().getText();
//		System.out.println("Selected by Value "+SelectedText);
	}
}