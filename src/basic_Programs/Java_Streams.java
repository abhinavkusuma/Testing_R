package basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.stream.Collectors;

public class Java_Streams {
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

        // ✅ Advanced Validations with Java Streams

        System.out.println("\n--- VALIDATION WITH ADVANCED STREAMS ---");

        // 1. Validate if product names are sorted alphabetically
        boolean isSortedByName = uiData.keySet()
					                   .stream()
					                   .sorted()
					                   .toList()
					                   .equals(new ArrayList<>(uiData.keySet()));

        System.out.println("\n Is product list sorted alphabetically? " + isSortedByName);

        // 2. Group products into Cheap (<= $20) and Expensive (> $20)
        Map<String, List<String>> groupedByPrice = uiData.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        entry -> {
                            double price = Double.parseDouble(entry.getValue().replace("$", "").replace(",", ""));
                            return (price <= 20) ? "Cheap" : "Expensive";
                        },
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));

        System.out.println("\n Products Grouped by Price Range:");
        groupedByPrice.forEach((category, products) -> {
            System.out.println(category + ": " + products);
        });

        // 3. Find Cheapest and Most Expensive Products
        uiData.entrySet()
              .stream()
              .min(Comparator.comparingDouble(e -> Double.parseDouble(e.getValue().replace("$", "").replace(",", ""))))
              .ifPresent(e -> System.out.println("\n Cheapest Product: " + e.getKey() + " -> " + e.getValue()));

        uiData.entrySet()
              .stream()
              .max(Comparator.comparingDouble(e -> Double.parseDouble(e.getValue().replace("$", "").replace(",", ""))))
              .ifPresent(e -> System.out.println(" Most Expensive Product: " + e.getKey() + " -> " + e.getValue()));

        // 4. Sort Products by Price (Low to High)
        System.out.println("\n Products Sorted by Price (Low to High):");
        uiData.entrySet()
              .stream()
              .sorted(Comparator.comparingDouble(e -> Double.parseDouble(e.getValue().replace("$", "").replace(",", ""))))
              .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        // 5. Validation against Backend Simulation
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

        boolean allDataMatches = uiData.entrySet()
					                   .stream()
					                   .allMatch(e -> backendData.containsKey(e.getKey()) && backendData.get(e.getKey()).equals(e.getValue()));

        if (allDataMatches) {
            System.out.println("\n All UI data matched with Backend!");
        } else {
            System.out.println("\n Data mismatch found between UI and Backend!");
        }

        driver.quit();
    }
}
