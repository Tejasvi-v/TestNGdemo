package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class scrollIntoViewElement {
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      WebElement l=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
	      JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", l);
	      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	      Thread.sleep(5000);
	      driver.close();
	 }
}
