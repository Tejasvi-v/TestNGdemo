package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class mutiplewindow {
	private WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
    	System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
    @Test
    public void testSwitchWindows() {

        driver.get("http://demosite.pragmatictestlabs.com/Frames%20and%20windows%20_%20Demoqa.html");
        driver.findElement(By.linkText("Click Hear to Open New Browser Tab")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("Number of windows handles " + tabs.size());
        for (String handle : tabs) {
            System.out.println("Window handle " + handle);
        }
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getTitle(), "Home | Pragmatic Test Labs");
    }
    @Test
    public void testTypeURLNewTab() {

        String url1 = "http://hrm.pragmatictestlabs.com";
        String url2 = "http://demosite.pragmatictestlabs.com";
        driver.get(url1);
        Assert.assertEquals(driver.getTitle(), "PTL-DemoHRM");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.get(url2);
        Assert.assertEquals(driver.getTitle(), "PracticeHomePage");
    }
    @Test
    public void testSwitchToOrginalWindows() {
        String url1 = "http://hrm.pragmatictestlabs.com";
        String url2 = "http://demosite.pragmatictestlabs.com";
        String firstWindowsHandle;
        driver.get(url1);
        firstWindowsHandle = driver.getWindowHandle();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.get(url2);
        driver.switchTo().window(firstWindowsHandle);
        Assert.assertEquals(driver.getTitle(), "PTL-DemoHRM");
    }
    @Test
    public void testSwitchToPopupWindows() {

        driver.get("http://demosite.pragmatictestlabs.com/Frames%20and%20windows%20_%20Demoqa.html");
        driver.findElement(By.linkText("Separate New Window")).click();
        driver.findElement(By.linkText("Click Hear to Open New Separate Window")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("Number of windows handles " + tabs.size());
        for (String handle : tabs) {
            System.out.println("Window handle " + handle);
        }
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getTitle(), "Pragmatic Test Labs");
    }
}
