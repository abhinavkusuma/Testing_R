package basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class Webtables_Pagination {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Map<String, String> tableData = new LinkedHashMap<>();

        // First manually find how many pages: 4 buttons
        int totalPages = 4;
        System.out.println("Total Pages: " + totalPages);
        System.out.println();

        // Loop through each page
        for (int p = 1; p <= totalPages; p++) {
            WebElement pageLink = driver.findElement(By.xpath("//div[@id='HTML8']//a[text()='" + p + "']"));
            pageLink.click();
            Thread.sleep(1000);  
            System.out.println("--- Page " + p + " ---");

            // Read the table
            WebElement table = driver.findElement(By.xpath("//div[@id='HTML8']//table"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            for (int i = 1; i < rows.size(); i++) {  // Skipping header
                List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
                if (columns.size() > 0) {
                    String id = columns.get(0).getText();
                    String name = columns.get(1).getText();
                    String price = columns.get(2).getText();
                    System.out.println(id + " | " + name + " | " + price);
                    tableData.put(name, price);
                }
            }
            System.out.println();
        }

        // Validation after all pages
        String expectedItem = "Smartphone";
        String expectedPrice = "$10.99";
        System.out.println("Validating item: " + expectedItem);
        if (tableData.containsKey(expectedItem)) {
            String actualPrice = tableData.get(expectedItem);
            System.out.println("Actual Price: " + actualPrice);
            System.out.println("Expected Price: " + expectedPrice);
            if (actualPrice.equals(expectedPrice)) {
                System.out.println("Price Matched");
            } 
            else {
                System.out.println("Price Mismatch");
            }
        } 
        else {
            System.out.println("Item " + expectedItem + " not found in the table.");
        }
        driver.quit();
    }
}