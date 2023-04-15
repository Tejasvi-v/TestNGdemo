package demo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class confirmationAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  WebDriverWait wait=new WebDriverWait(driver, 5000);
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/alerts");
		  WebElement element = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		  Alert confirmationAlert = driver.switchTo().alert();
		  String alertText = confirmationAlert.getText();
		  //System.out.println("Alert text is " + alertText);
		  if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
			  confirmationAlert.accept();
			   driver.close();
		  }
		 }
}
