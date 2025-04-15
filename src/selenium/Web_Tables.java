package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/ecosystem/");
		
		// 1. How many Rows in a Table (Only in <tbody>)
		int rows = driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr")).size();
		System.out.println("Total Number of rows in the Table: " + rows);
		
		// 2. How many Columns in a Table (Count from first row in <tbody>)
		int cols = driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr[1]/td")).size();
		System.out.println("Total Number of columns in the Table: " + cols);
		
		// 3. Retrieve Specific Row/Column data
		String value = driver.findElement(By.xpath("(//table[@class='table'])[1]/tbody/tr[3]/td[1]")).getText();
		System.out.println("The Value at Row 3, Column 1 is: " + value);
				
		// 4. Retrieve all data from the Table
		/*System.out.println("Data from the Table: ");
		for(int r = 1; r <= rows; r++) {
			for(int c = 1; c <= cols; c++) {
				String data = driver.findElement(By.xpath("(//table[@class='table'])[1]/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data + "     ");
			} 
			System.out.println(); // New line for each row
		}*/
		
		//  5. Print Language and Author Name
		for(int r=1;r<=rows;r++) {
			String language = driver.findElement(By.xpath("(//table[@class='table'])[1]/tbody/tr["+r+"]/td[1]")).getText();
			
			if (language.equals("Haskell")) {
				String author = driver.findElement(By.xpath("(//table[@class='table'])[1]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println(language+"   "+author);
			}
		}
		driver.quit();
	}
}