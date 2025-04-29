package selenium;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Streams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/ecosystem/");
		List<WebElement> languageElements = driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr/td[1]"));
		System.out.println("All Language Names:");
		languageElements.stream()
			.map(WebElement::getText)
			.forEach(System.out::println);
		List<String> jLanguages = languageElements.stream()
			.map(WebElement::getText)
			.filter(lang -> lang.startsWith("J"))
			.map(String::toUpperCase)
			.sorted()
			.collect(Collectors.toList());
		System.out.println("\nLanguages Starting with 'J' (Uppercase & Sorted): " + jLanguages);
		long cCount = languageElements.stream()
			.map(WebElement::getText)
			.filter(lang -> lang.startsWith("P"))
			.count();
		System.out.println("\nNumber of Languages starting with 'P': " + cCount);
		Set<String> uniqueLanguages = languageElements.stream()
			.map(WebElement::getText)
			.collect(Collectors.toSet());
		System.out.println("\nUnique Language Names: " + uniqueLanguages);
		driver.quit();
	}
}