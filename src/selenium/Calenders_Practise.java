package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calenders_Practise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//		int day = 27;
		
		// First Calendar
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("(//table[@class=\"ui-datepicker-calendar\"]//a[text()="+day+"])")).click();
		
		// Second Calendar
//		driver.findElement(By.id("second_date_picker")).click();
//		driver.findElement(By.xpath("(//table[@class=\"ui-datepicker-calendar\"]//td[not(contains(@class,\"ui-datepicker-other-month\"))]//a[text()="+day+"])")).click();
		
		
		driver.findElement(By.id("first_date_picker")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!(aMonth.equals("May") && aYear.equals("2026"))) {
			driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
			aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]/a[text()=\"1\"]")).click();
	}
}