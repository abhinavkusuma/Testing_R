package smokeTest_Cases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order_Summary {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		driver.findElement(By.id("213e8764-0133-417b-9ae6-a3dc2d4805c8")).click();
		driver.findElement(By.xpath("//a[@href='https://www.ulta.com/brand/all']")).click();
		driver.findElement(By.xpath("(//span [@class=\"Text-ds Text-ds--body-2 Text-ds--center Text-ds--black\"])[2]")).click();
		driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[1]//button[1]")).click();
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"pal-c-Link pal-c-Link--buttonPrimary pal-c-Link--compact\"]")).click();		
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default CartActions__CheckoutButton\"]")).click();
		String Subtotal = driver.findElement(By.xpath("//span[normalize-space()='$11.20']")).getText();
		System.out.println("Subtotal : "+Subtotal);
		String Shipping = driver.findElement(By.xpath("//span[normalize-space()='$6.95']")).getText();
		System.out.println("Shipping : "+Shipping);
		String Tax = driver.findElement(By.xpath("//span[normalize-space()='$1.15']")).getText();
		System.out.println("Tax : "+Tax);
		double subtotal = Double.parseDouble(Subtotal.replace("$", ""));
		double shipping = Double.parseDouble(Shipping.replace("$", ""));
		double tax = Double.parseDouble(Tax.replace("$", ""));
		double taxRate = (tax * 100) / (subtotal + shipping);
	    System.out.printf("Tax Rate: %.2f%%\n", taxRate);
        double CalculatedTax = ((subtotal + shipping) * taxRate) / 100;
        System.out.printf("Calculated Tax: $%.2f\n", CalculatedTax);
        if (Math.abs(tax - CalculatedTax) < 0.01) {
            System.out.println("Tax matches");
        } else {
            System.out.println("Tax does not match");
        }
	}
}