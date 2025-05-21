package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws Exception   {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");       
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url == null || !url.startsWith("http")) {
                System.out.println("Skipping invalid link: " + url);
                continue;
            }
            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
                connection.setConnectTimeout(5000);
                connection.connect();
                int statusCode = connection.getResponseCode();
                String message = connection.getResponseMessage();
                if (statusCode >= 400) {
                    System.out.println("Broken link: " + url + " - " + statusCode + " - " + message);
                } else {
                    System.out.println("Valid link: " + url + " - " + statusCode + " - " + message);
                }
                connection.disconnect();
            } catch (Exception e) {
                System.out.println("Error checking link: " + url + " - " + e.getMessage());
            }
        }
        driver.quit();
	}
}