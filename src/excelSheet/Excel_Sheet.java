package excelSheet;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Excel_Sheet {

    public static void main(String[] args) throws IOException {
        // 1. Start ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Open your PLP URL
        driver.get("https://www.ulta.com/shop/new-beauty-products?category=makeup");
        
        // 3. Find products
        List<WebElement> productNames = driver.findElements(By.className("ProductCard__product")); // Adjust selector
        List<WebElement> productPrices = driver.findElements(By.className("ProductPricing")); // Adjust selector

        // 4. Print to console and write to Excel
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("PLP Products");

        // Header
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Product Name");
        header.createCell(1).setCellValue("Price");

        for (int i = 0; i < productNames.size(); i++) {
            String name = productNames.get(i).getText();
            String price = productPrices.get(i).getText();

            System.out.println("Product " + (i + 1) + ": " + name + " - " + price);

            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(name);
            row.createCell(1).setCellValue(price);
        }

        // 5. Write to Excel
        FileOutputStream fileOut = new FileOutputStream("PLP_Products.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();

        System.out.println("Excel file created: PLP_Products.xlsx");

        // 6. Cleanup
        driver.quit();
    }
}