package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_WebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/ecosystem/");
		int rows = driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr")).size();
		System.out.println("Total Rows: " + rows);
		List<WebElement> languageElements = driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr/td[1]"));		
		List<String> originalList = new ArrayList<>();
		for (WebElement ele : languageElements) {
			originalList.add(ele.getText());
		}
		System.out.println("Original Language List from Table: " + originalList);
		List<String> sortedList = new ArrayList<>(originalList);
		Collections.sort(sortedList);
		System.out.println("Alphabetically Sorted List: " + sortedList);
		if (originalList.equals(sortedList)) {
			System.out.println("The Language column is sorted alphabetically.");
		} else {
			System.out.println("The Language column is NOT sorted alphabetically.");
		}
		driver.quit();
	}
}