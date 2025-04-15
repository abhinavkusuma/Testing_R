package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
		
		// File
//		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./screenshot/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot Saved Successfully");
		
		// Bytes
//		byte[] byteArray = driver.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./screenshot/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArray);
//		fos.close();
//		System.out.println("Screenshot Saved Successfully");
		
		// Base 64
//		String base64 = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArray = Base64.getDecoder().decode(base64);
//		File destFile = new File("./screenshot/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArray);
//		fos.close();
//		System.out.println("Screenshot Saved Successfully");
//		driver.quit();
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		// File
//		TakesScreenshot ss =  (TakesScreenshot)driver;
//		File sourceFile = ss.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./screenshot/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot Saved Successfully");
		
		// Bytes
//		TakesScreenshot ss =  (TakesScreenshot)driver;
//		byte[] byteArray = ss.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./screenshot/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArray);
//		fos.close();
//		System.out.println("Screenshot Saved Successfully");
		
		// Base 64
		TakesScreenshot ss =  (TakesScreenshot)driver;
		String base64 = ss.getScreenshotAs(OutputType.BASE64);
		byte[] byteArray = Base64.getDecoder().decode(base64);
		File destFile = new File("./screenshot/img1.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(byteArray);
		fos.close();
		System.out.println("Screenshot Saved Successfully");
		
		driver.quit();
	}
}