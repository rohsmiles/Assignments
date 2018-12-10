package Assign1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Furlenco {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.furlenco.com/");
	driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
	driver.switchTo().frame(driver.findElement(By.id("fb_xdm_frame_https")));
	driver.findElement(By.xpath("(//div[text()='Living Room'])[2]")).click();
}
}
