package selenium;

import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LoggingPreferences;

public class Console_Logs {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable("browser", Level.ALL); // Capture all log levels
		options.setCapability("goog:loggingPrefs", logPrefs);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		LogEntries logs = driver.manage().logs().get("browser");
		for (LogEntry entry : logs) {
			System.out.println("[" + entry.getLevel() + "] " + entry.getMessage());
		}
		driver.quit();
	}
}