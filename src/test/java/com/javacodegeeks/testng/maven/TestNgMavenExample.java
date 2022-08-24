package com.javacodegeeks.testng.maven;

import java.time.LocalTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgMavenExample{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws InterruptedException 
	{
		System.out.println("Started=============");
		LocalTime myObj = LocalTime.now();
		System.out.println(myObj);
		System.setProperty("webdriver.chrome.driver","E://WebDriver//chromedriver.exe");
		//if(driver==null)
		{
			driver = new ChromeDriver();
		}//
		driver.manage().window().maximize();
		driver.get("https://freecrm.com");
		System.out.println("Navigate to Defaultpage");
			PageFactory.initElements(driver,LoginPageObjects.class);
			Thread.sleep(15000);
			LoginPageObjects.login.click();
			Thread.sleep(10000);
			LoginPageObjects.userNameTxtBox.sendKeys("praveendev404@gmail.com");
			LoginPageObjects.passwordTxtBox.sendKeys("Test1111$");
			LoginPageObjects.loginBtn.click();
	}
	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
	@Test
	public void calenderpageobjects() throws InterruptedException
	{
		PageFactory.initElements(driver, CalenderPageObjects.class);
		Thread.sleep(10000);
		CalenderPageObjects.calendermenu.click();
		Thread.sleep(5000);
		CalenderPageObjects.calendernewbtn.click();
		CalenderPageObjects.titlebtn.sendKeys("Time sheet");
		CalenderPageObjects.DescriptiontxtBox.sendKeys("Updated New Calender");
		CalenderPageObjects.LocationtxtBox.sendKeys("Hyderabad");
		CalenderPageObjects.ReminderTimetxtBox.sendKeys("40");
		CalenderPageObjects.IdentifiertxtBox.sendKeys("Time Sheet");
		CalenderPageObjects.savebtn.click();
	}
	@AfterMethod
	public void browserClose() {
	//driver.quit();
	}
	@Test
	public void contactspageobjects() throws InterruptedException {
		PageFactory.initElements(driver, ContactsPageObjects.class);
		Thread.sleep(10000);
		ContactsPageObjects.contantsmenu.click();
		Thread.sleep(5000);
		ContactsPageObjects.contantsnewbtn.click();
		ContactsPageObjects.firstnametxtBox.sendKeys("Tejasvi");
		ContactsPageObjects.lastnametxtBox.sendKeys("Veerapaneni");
		ContactsPageObjects.middlenametxtBox.sendKeys("Teju");
		ContactsPageObjects.emailaddresstxtBox.sendKeys("tejasviteju1410@gmail.com");
		ContactsPageObjects.personalemailtxtBox.sendKeys("vtejasvi2018@gmail.com");
		ContactsPageObjects.addicon.click();
		ContactsPageObjects.descriptiontxtBox.sendKeys("Updated New Contacts");
		ContactsPageObjects.socialchannels.sendKeys("Tejasvi");
		ContactsPageObjects.streetaddresstxtBox.sendKeys("Orange Street");
		ContactsPageObjects.citytxtBox.sendKeys("NY");
		ContactsPageObjects.statetxtBox.sendKeys("USA");
		ContactsPageObjects.postcodetxtBox.sendKeys("61813");
		ContactsPageObjects.numbertxtBox.sendKeys("7243667443");
		ContactsPageObjects.positiontxtBox.sendKeys("Vice President");
		ContactsPageObjects.departmenttxtBox.sendKeys("IT");
		ContactsPageObjects.yeartxtBox.sendKeys("1991");
		ContactsPageObjects.identifiertxtBox.sendKeys("Test1234");
		ContactsPageObjects.savebtn.click();
	}
	@Test
	public void companiespageobjects() throws InterruptedException {
		PageFactory.initElements(driver, CompaniesPageObjects.class);
		Thread.sleep(10000);
		CompaniesPageObjects.Companiesmenu.click();
		Thread.sleep(5000);
		CompaniesPageObjects.CompaniescreateBtn.click();
		CompaniesPageObjects.NametxtBox.sendKeys("Tejasvi");
		CompaniesPageObjects.WebsitetxtBox.sendKeys("https://www.facebook.com");
		CompaniesPageObjects.AddresstxtBox.sendKeys("Edison");
		CompaniesPageObjects.CitytxtBox.sendKeys("NJ");
		CompaniesPageObjects.StatetxtBox.sendKeys("New York");
		CompaniesPageObjects.PostalcodetxtBox.sendKeys("61093");
		CompaniesPageObjects.AddresstxtBtn1.sendKeys("Ohio");
		CompaniesPageObjects.CitytxtBox1.sendKeys("DC");
		CompaniesPageObjects.StatetxBox1.sendKeys("Calforina");
		CompaniesPageObjects.PostalcodetxtBox1.sendKeys("64554");
		CompaniesPageObjects.NumbertxtBox.sendKeys("734543534");
		CompaniesPageObjects.HometxtBox.sendKeys("734534534");
		CompaniesPageObjects.DescriptiontxtBox.sendKeys("Updated the New Companies for data restored");
		CompaniesPageObjects.TwittertxtBox.sendKeys("Tejasviteju_96");
		CompaniesPageObjects.IndustrytxtBox.sendKeys("IT Technology");
		CompaniesPageObjects.NoofemployeestxtBox.sendKeys("3000");
		CompaniesPageObjects.symboltxtBox.sendKeys("@#@!");
		CompaniesPageObjects.AnnualRevenuetxtBox.sendKeys("100 Million");
		JavascriptExecutor executor = (JavascriptExecutor) this.driver;
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'High';", CompaniesPageObjects.PrioritydropdownBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Active';", CompaniesPageObjects.StatusdropdownBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Partner';", CompaniesPageObjects.SourcedropdownBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Client';", CompaniesPageObjects.CategorydropdownBox);
		CompaniesPageObjects.VATNumbertxtBox.sendKeys("46346346");
		CompaniesPageObjects.IdentifiertxtBox.sendKeys("New Company");
	}
	}




