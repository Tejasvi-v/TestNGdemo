package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public void browseropen() {
	System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ui.freecrm.com");
}
}
