package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath="//a[contains(@href,'contacts')]/span")
	public static WebElement contantsmenu;
	
	@FindBy(xpath="//a[contains(@href, 'contacts/new')]")
	public static WebElement contantsnewbtn;
	
	@FindBy(xpath="//input[@name='first_name']")
	public static WebElement firstnametxtBox;
	
	@FindBy(xpath="//input[@name='last_name']")
	public static WebElement lastnametxtBox;
	
	@FindBy(xpath="//input[@name='middle_name']")
	public static WebElement middlenametxtBox;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	public static WebElement emailaddresstxtBox;
	
	@FindBy(xpath="//input[@placeholder='Personal email, Business, Alt...']")
	public static WebElement personalemailtxtBox;
	
	@FindBy(xpath="//div//label[text()='Category']/parent::div//div//div[@class='divider default text']")
	public static WebElement categorybtn;
	
	@FindBy(xpath="//div//label[text()='Status']/parent::div//div//div[@class='divider default text']")
	public static WebElement statusbtn;
	
	@FindBy(xpath="//div//label[text()='Time Zone']/parent::div//div//input[contains(@class, 'search')]")
	public static WebElement timezonebtn;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Description')]/textarea")
	public static WebElement descriptiontxtBox;
	
	@FindBy(xpath="//input[@placeholder='Twitter handle']")
	public static WebElement socialchannels;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	public static WebElement streetaddresstxtBox;
	
	@FindBy(xpath="//input[@placeholder='City']")
	public static WebElement citytxtBox;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	public static WebElement statetxtBox;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	public static WebElement postcodetxtBox;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	public static WebElement numbertxtBox;
	
	@FindBy(xpath="//input[@name='position']")
	public static WebElement positiontxtBox;
	
	@FindBy(xpath="//input[@name='department']")
	public static WebElement departmenttxtBox;
	
	@FindBy(xpath="//div//label[text()='Source']/parent::div//div//div[@class='divider default text']")
	public static WebElement sourcetxtBox;
	
	@FindBy(xpath="//input[@name='do_not_call']")
	public static WebElement Dontcallcheckbox;
	
	@FindBy(xpath="//input[@name='do_not_text']")
	public static WebElement Donottextcheckbox;
	
	@FindBy(xpath="//input[@name='do_not_email']")
	public static WebElement Donotemailcheckbox;
	
	@FindBy(xpath="//input[@name='day']")
	public static WebElement daytxtBox;
	
	@FindBy(xpath="//div[@name='month']")
	public static WebElement monthtxtBox;
	
	@FindBy(xpath="//input[@name='year']")
	public static WebElement yeartxtBox;
	
	@FindBy(xpath="//input[@name='identifier']")
	public static WebElement identifiertxtBox;
	
	@FindBy(xpath="//input[@name='fileField']")
	public static WebElement ImagetxtBox;
	
	@FindBy(xpath="//div[contains(@class,'item')]/button[@class='ui linkedin button']")
	public static WebElement savebtn;
	
	
	public static void Contacts()
	{
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebDriverWait wait =new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.elementToBeClickable(ContactsPage.contantsmenu));
		ContactsPage.contantsmenu.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		ContactsPage.contantsnewbtn.click();
		ContactsPage.firstnametxtBox.sendKeys("Tejasvi");
		ContactsPage.lastnametxtBox.sendKeys("Veerapaneni");
		ContactsPage.middlenametxtBox.sendKeys("Teju");
		ContactsPage.emailaddresstxtBox.sendKeys("tejasviteju1410@gmail.com");
		ContactsPage.personalemailtxtBox.sendKeys("vtejasvi2018@gmail.com");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Customer';",
				ContactsPage.categorybtn);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Inactive';",
				ContactsPage.statusbtn);
		ContactsPage.descriptiontxtBox.sendKeys("Updated New Contacts");
		ContactsPage.socialchannels.sendKeys("Tejasvi");
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Africa/Abidjan';",
				ContactsPage.timezonebtn);
		ContactsPage.streetaddresstxtBox.sendKeys("Orange Street");
		ContactsPage.citytxtBox.sendKeys("NY");
		ContactsPage.statetxtBox.sendKeys("USA");
		ContactsPage.postcodetxtBox.sendKeys("61813");
		ContactsPage.numbertxtBox.sendKeys("7243667443");
		ContactsPage.positiontxtBox.sendKeys("Vice President");
		ContactsPage.departmenttxtBox.sendKeys("IT");
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Facebook';",
				ContactsPage.sourcetxtBox);
		executor.executeScript("document.getElementsByName('do_not_call')[0].click();");
		executor.executeScript("document.getElementsByName('do_not_text')[0].click();");
		executor.executeScript("document.getElementsByName('do_not_email')[0].click();");
		ContactsPage.daytxtBox.sendKeys("14");
		ContactsPage.monthtxtBox.sendKeys("December");
		ContactsPage.yeartxtBox.sendKeys("1991");
		ContactsPage.identifiertxtBox.sendKeys("Test1234");
		ContactsPage.ImagetxtBox.sendKeys("C://Users//Teju//Pictures//Saved Pictures//FreeCRM.png");
		ContactsPage.savebtn.click();
		driver.close();
	}
}
