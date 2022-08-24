package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageObjects {

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
	
	@FindBy(xpath="//button/i[@class='add icon']")
	public static WebElement addicon;
	
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
	
	@FindBy(xpath="//input[@name='year']")
	public static WebElement yeartxtBox;
	
	@FindBy(xpath="//input[@name='identifier']")
	public static WebElement identifiertxtBox;
	
	@FindBy(xpath="//div[contains(@class,'item')]/button[@class='ui linkedin button']")
	public static WebElement savebtn;
}
