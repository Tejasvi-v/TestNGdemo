package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class CampaignPage extends TestBase{

	@FindBy(xpath="//a[contains(@href,'campaigns')]")
	public static WebElement Campaignsmenu;
	
	@FindBy(xpath="//a[contains(@href, 'campaigns/new')]")
	public static WebElement Campaignsbtn;
			
	@FindBy(xpath="//input[@name='active']")
	public static WebElement Active;
	
	public static void campaign() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebDriverWait wait =new WebDriverWait (driver, 10000);
		wait.until(ExpectedConditions.elementToBeClickable(CampaignPage.Campaignsmenu));
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Thread.sleep(10000);
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Campaignsmenu);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		CampaignPage.Campaignsbtn.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Active);
	}
}

