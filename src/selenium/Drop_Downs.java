package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Downs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement courseName = driver.findElement(By.id("course"));
		Select dropDown = new Select(courseName);
		List<WebElement> dropDownOptions = dropDown.getOptions();
		for (WebElement option : dropDownOptions) {
			System.out.println(option.getText());
		}
		dropDown.selectByIndex(1);
		Thread.sleep(3000);
		dropDown.selectByValue("js");
		Thread.sleep(3000);
		dropDown.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		String selectedText = dropDown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text - " +selectedText);
		
		
		//  Multiple-Selection Dropdown

		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for (WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);
		Thread.sleep(3000);
		ideDropdown.selectByValue("ij");
		Thread.sleep(3000);
		ideDropdown.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		ideDropdown.deSelectByContainsVisibleText("IntelliJ IDEA");
		
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible text - " +( selectedOption).getText());
		}
	}		
}