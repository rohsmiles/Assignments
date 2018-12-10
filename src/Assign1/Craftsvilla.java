package Assign1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Craftsvilla {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.craftsvilla.com/");
	driver.findElement(By.xpath("//a[text()='SAREES']")).click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement filter = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("price_above5000"))));
	filter.click();
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	String price = driver.findElement(By.xpath("(//span[@class='product-offer-price'])[3]")).getText();
	System.out.println(price);
}
}
