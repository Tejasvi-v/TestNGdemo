package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.page.CompaniesPage;
public class GetAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   WebDriverWait wait=new WebDriverWait(driver, 5000);
		   driver.get("https://demoqa.com/alerts");
		   WebElement element = driver.findElement(By.xpath("//button[@id='promtButton']"));
		   wait.until(ExpectedConditions.elementToBeClickable(element));
		   JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		   Alert promptAlert  = driver.switchTo().alert();
		   String alertText = promptAlert.getText();
		   //System.out.println("Alert text is " + alertText);
		   promptAlert.sendKeys("Test User");
		   if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
			   promptAlert.accept();
			   driver.close();
		   }
			     
		}
}

