package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	    Actions actions = new Actions(driver);
	    WebElement mainitem=driver.findElement(By.xpath("//ul[@id='nav']/li/a[contains(text(), 'Main Item 2')]"));
	    actions.moveToElement(mainitem).perform();
	    WebElement SubSublist=driver.findElement(By.xpath("//ul[@id='nav']/li/ul/li/a[contains(text(), 'SUB SUB LIST')]"));
	    actions.moveToElement(SubSublist).perform();
	    WebElement SubSubitem1=driver.findElement(By.xpath("//ul[@id='nav']/li/ul/li/ul/li/a[contains(text(), 'Sub Sub Item 1')]"));
	    SubSubitem1.click();
	}	
	
}

