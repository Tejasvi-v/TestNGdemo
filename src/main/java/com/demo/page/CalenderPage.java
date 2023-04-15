package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class CalenderPage extends TestBase{
	
	@FindBy(xpath="//a[contains(@href,'calendar')]")
	public static WebElement calendermenu;
	
	@FindBy(xpath="//a[contains(@href,'calendar/new')]")
	public static WebElement calendernewbtn;
	
	@FindBy(xpath="//div[@class='item']/button[@class='ui button']")
	public static WebElement cancelicon;
	
	@FindBy(xpath="//a[contains(@href,'calendar/new')]")
	public static WebElement calendernewbtn1;
	
	@FindBy(xpath="//input[@name='title']")
	public static WebElement titlebtn;
	
	@FindBy(xpath="//div//label[text()='Category']/parent::div//div//div[contains(@class, 'divider default text')]")
	public static WebElement categorycheckbox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Description')]/textarea")
	public static WebElement DescriptiontxtBox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Location')]/textarea")
	public static WebElement LocationtxtBox;
	
	@FindBy(xpath="//input[@name='all_day']")
	public static WebElement alldaycheckbox;
	
	@FindBy(xpath="//div[@name='channels']/div/div/span[text()='Email']")
	public static WebElement AlertViaEmail;
	
	@FindBy(xpath="//div[@name='channels']/div/div/span[text()='SMS']")
	public static WebElement AlertViaSMS;
	
	@FindBy(xpath="//div[@name='channels']/i[@class='dropdown icon']")
	public static WebElement dropdownicon;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Reminder Time')]/div[@class='ui input']/input")
	public static WebElement ReminderTimetxtBox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Identifier')]/div[@class='ui input']/input")
	public static WebElement IdentifiertxtBox;
	
	@FindBy(xpath="//div[contains(@class,'item')]/button[@class='ui linkedin button']")
	public static WebElement savebtn;
	
	
	public static void Calender() 
	{
		WebDriverWait wait =new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.elementToBeClickable(CalenderPage.calendermenu));
		CalenderPage.calendermenu.click();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		CalenderPage.calendernewbtn.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		CalenderPage.cancelicon.click();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		CalenderPage.calendernewbtn1.click();
		CalenderPage.titlebtn.sendKeys("Time sheet");
		CalenderPage.DescriptiontxtBox.sendKeys("Updated New Calender");
		CalenderPage.LocationtxtBox.sendKeys("Hyderabad");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementsByName('all_day')[0].click();");
		executor.executeScript("window.scrollBy(0,1000)");
		CalenderPage.dropdownicon.click();
		CalenderPage.AlertViaEmail.click();
		CalenderPage.AlertViaSMS.click();
		CalenderPage.ReminderTimetxtBox.sendKeys("40");
		CalenderPage.IdentifiertxtBox.sendKeys("Time Sheet");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		CalenderPage.savebtn.click();
		driver.close();	
	}
}
