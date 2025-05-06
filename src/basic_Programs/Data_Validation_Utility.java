package basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Data_Validation_Utility {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        LinkedHashMap<String, String> uiData = new LinkedHashMap<>();
        int totalPages = 4;
        System.out.println("Total Pages: " + totalPages);
        System.out.println();
        for (int p = 1; p <= totalPages; p++) {
            WebElement pageLink = driver.findElement(By.xpath("//div[@id='HTML8']//a[text()='" + p + "']"));
            pageLink.click();
            Thread.sleep(1000);
            System.out.println("--- Page " + p + " ---");
            WebElement table = driver.findElement(By.xpath("//div[@id='HTML8']//table"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            for (int i = 1; i < rows.size(); i++) {
                List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
                if (columns.size() > 0) {
                    String id = columns.get(0).getText();
                    String name = columns.get(1).getText();
                    String price = columns.get(2).getText();
                    System.out.println(id + " | " + name + " | " + price);
                    uiData.put(name, price);
                }
            }
            System.out.println();
        }
        // Simulated Backend Data
        Map<String, String> backendData = new LinkedHashMap<>();
        backendData.put("Smartphone", "$10.99");
        backendData.put("Laptop", "$19.99");
        backendData.put("Tablet", "$5.99");
        backendData.put("Smartwatch", "$7.99");
        backendData.put("Wireless Earbuds", "$8.99");
        backendData.put("Bluetooth Speaker", "$9.99");
        backendData.put("Television", "$20.99");
        backendData.put("Action Camera", "$15.99");
        backendData.put("Gaming Console", "$5.99");
        backendData.put("Digital Camera", "$16.99");
        backendData.put("Smart Home Hub", "$20.99");
        backendData.put("Router", "$24.99");
        backendData.put("Portable Charger", "$30.99");
        backendData.put("Fitness Tracker", "$19.99");
        backendData.put("Desktop Computer", "$2.99");
        backendData.put("E-Reader", "$10.99");
        backendData.put("VR Headset", "$11.99");
        backendData.put("Streaming Device", "$13.99");
        backendData.put("Soundbar", "$16.99");
        backendData.put("Wireless Mouse 20", "$17.99");
        
        // Now validate
        System.out.println("=== Data Validation ===\n");

        // 1. Check if all backend items exist in UI
        for (String backendItem : backendData.keySet()) {
            if (uiData.containsKey(backendItem)) {
                String backendPrice = backendData.get(backendItem);
                String uiPrice = uiData.get(backendItem);

                if (backendPrice.equals(uiPrice)) {
                    System.out.println(" " + backendItem + " matched with price " + uiPrice);
                } 
                else {
                    System.out.println(" " + backendItem + " price mismatch. Backend: " + backendPrice + ", UI: " + uiPrice);
                }
            } 
            else {
                System.out.println(" " + backendItem + " missing in UI data.");
            }
        }
        System.out.println();
        // 2. Check if UI has extra items
        for (String uiItem : uiData.keySet()) {
            if (!backendData.containsKey(uiItem)) {
                System.out.println("Extra item found in UI: " + uiItem);
            }
        }
        driver.quit();
    }
}