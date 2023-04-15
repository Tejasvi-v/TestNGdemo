package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
public class Alerthandling {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_full_name")).sendKeys("Tejasvi Veerapaneni"); 
		driver.findElement(By.id("user_email_login")).sendKeys("tejasviteju1410@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Tejasvi12345@");
		driver.findElement(By.xpath("//input[@value='Sign me up']")).click();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    Alert alert = driver.switchTo().alert(); 
		String alertMessage= driver.switchTo().alert().getText(); 
		System.out.println(alertMessage); 
		Thread.sleep(9000);
		alert.accept(); 
		}
}
