package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_Calenders {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		String year = "2026";
		String month = "May";
		String date = "23";
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if (currentMonth.equals(month)&&currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click(); // Next
//			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click(); // Previous
		}
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td//a"));
		for(WebElement dt : allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
}