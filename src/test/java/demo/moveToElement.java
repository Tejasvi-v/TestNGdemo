package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
public class moveToElement {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      Thread.sleep(2000);
	      driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	      WebElement l=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
	      Actions a = new Actions(driver);
	      a.moveToElement(l);
	      a.perform();
	      Thread.sleep(2000);
	      driver.close();
	   }
}
