package com.demo.test;

import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.base.TestBase;
import com.demo.page.CalenderPage;
import com.demo.page.CampaignPage;
import com.demo.page.CompaniesPage;
import com.demo.page.ContactsPage;
import com.demo.page.DealPage;
import com.demo.page.LoginPage;

public class TestNgMavenExample extends TestBase{
LoginPage loginPage;
CalenderPage calenderPage;
ContactsPage contactsPage;
CompaniesPage companiesPage;
DealPage dealPage;
CampaignPage campaignPage;

	@BeforeMethod
	public void openBrowser() throws InterruptedException {
		LocalTime myObj = LocalTime.now();
		System.out.println(myObj);
		browseropen();
		String title=driver.getTitle();
		System.out.println(title);
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.Login();
		Thread.sleep(2000);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		}

	@Test (priority=1)
	public void calenderpage() throws InterruptedException {
		PageFactory.initElements(driver, CalenderPage.class);
		calenderPage.Calender();
}

	@Test (priority=2)
	public void contactspage() throws InterruptedException {
		PageFactory.initElements(driver, ContactsPage.class);
		contactsPage.Contacts();
		
	}

	@Test (priority=3)
	public void companiespage() throws InterruptedException {
		PageFactory.initElements(driver, CompaniesPage.class);
		companiesPage.companies();
	}
	
	@Test (priority=4)
	public void DealPage() throws InterruptedException {
		PageFactory.initElements(driver, DealPage.class);
		dealPage.deal();
	}
	
	@Test (priority=5)
	public void CompaignPage() throws InterruptedException {
		PageFactory.initElements(driver, CampaignPage.class);
		campaignPage.campaign();
	}
	
}