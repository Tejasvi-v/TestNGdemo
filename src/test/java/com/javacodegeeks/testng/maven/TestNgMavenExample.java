package com.javacodegeeks.testng.maven;

import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgMavenExample {

	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Started=============");
		LocalTime myObj = LocalTime.now();
		System.out.println(myObj);
		System.setProperty("webdriver.chrome.driver","E://WebDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com");
		System.out.println("Completed=============");
	}
}
