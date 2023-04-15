package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mousehover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebDriverWait wait=new WebDriverWait(driver, 5000);
	    Actions actions = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement mainitem=driver.findElement(By.xpath("//ul[@id='nav']/li/a[contains(text(), 'Main Item 2')]"));
	    wait.until(ExpectedConditions.elementToBeClickable(mainitem));
	    actions.moveToElement(mainitem).perform();
	    WebElement SubSublist=driver.findElement(By.xpath("//ul[@id='nav']/li/ul/li/a[contains(text(), 'SUB SUB LIST')]"));
	    actions.moveToElement(SubSublist).perform();
	    WebElement SubSubitem1=driver.findElement(By.xpath("//ul[@id='nav']/li/ul/li/ul/li/a[contains(text(), 'Sub Sub Item 1')]"));
	    SubSubitem1.click();
	}	
	
}

