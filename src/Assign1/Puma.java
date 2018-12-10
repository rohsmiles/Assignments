package Assign1;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Puma {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void sort(List<WebElement> subMenu) {
	TreeSet<String> ts=new TreeSet<>();
	for (WebElement wb:subMenu) {
		ts.add(wb.getText());
	}
	System.out.println(ts);
}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.puma.com");
	WebElement menu1 = driver.findElement(By.xpath("//a[@data-subnav='men-subnav']"));
	String Mtext = menu1.getText();
	System.out.println(Mtext);
	Actions actions=new Actions(driver);
	actions.moveToElement(menu1).perform();
	List<WebElement> submenu = menu1.findElements(By.xpath("//li[@id='men-subnav']//li/a"));	
	sort(submenu);
	WebElement menu2 = driver.findElement(By.xpath("//a[@data-subnav='women-subnav']"));
	String Mtext2 = menu2.getText();
	System.out.println(Mtext2);
	actions.moveToElement(menu2).perform();
	List<WebElement> submenu2 = menu2.findElements(By.xpath("//li[@id='women-subnav']//li/a"));
	sort(submenu2);
	WebElement menu3 = driver.findElement(By.xpath("//a[@data-subnav='kids-subnav']"));
	String Mtext3=menu3.getText();
	System.out.println(Mtext3);
	WebElement menu4 = driver.findElement(By.xpath("//a[@data-subnav='sports-subnav']"));
	String Mtext4=menu4.getText();
	System.out.println(Mtext4);
	actions.moveToElement(menu4).perform();
	List<WebElement> submenu3 = menu4.findElements(By.xpath("//li[@id='sports-subnav']//li/a"));
	sort(submenu3);
	WebElement menu5 = driver.findElement(By.xpath("//a[@data-subnav='collections-subnav']"));
	String Mtext5=menu5.getText();
	System.out.println(Mtext5);
	actions.moveToElement(menu5).perform();
	List<WebElement> submenu4 = menu5.findElements(By.xpath("//li[@id='collections-subnav']//li/a"));
	sort(submenu4);
	WebElement menu6 = driver.findElement(By.xpath("//a[@data-subnav='sale-subnav']"));
	String Mtext6=menu6.getText();
	System.out.println(Mtext6);
	actions.moveToElement(menu6).perform();
	List<WebElement> submenu5 = menu6.findElements(By.xpath("//li[@id='sale-subnav']//li/a"));
	sort(submenu5);
	driver.close();	
}
}
