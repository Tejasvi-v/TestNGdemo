package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String URL="https://demoqa.com/droppable/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		Actions build=new Actions(driver);
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		build.dragAndDrop(from, to).perform();
		String textTo=to.getText();
		textTo.equals("Dropped");
	}
}
