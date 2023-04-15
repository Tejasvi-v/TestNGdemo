package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public void browseropen() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://ui.freecrm.com");
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}
