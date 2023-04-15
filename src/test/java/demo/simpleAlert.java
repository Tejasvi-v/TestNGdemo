package demo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class simpleAlert {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/alerts");
		    driver.findElement(By.id("alertButton")).click();
		    Alert simpleAlert = driver.switchTo().alert();
		    simpleAlert.accept();
		    driver.close();
		  }
		}
