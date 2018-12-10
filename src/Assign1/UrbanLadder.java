package Assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		WebElement menu1 = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu1).perform();
		//menu1.findElements(arg0)
		System.out.println("to check in github");
		
	}

}
