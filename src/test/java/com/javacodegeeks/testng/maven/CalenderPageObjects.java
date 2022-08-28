package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderPageObjects {
	
	@FindBy(xpath="//a[contains(@href,'calendar')]")
	public static WebElement calendermenu;
	
	@FindBy(xpath="//a[contains(@href,'calendar/new')]")
	public static WebElement calendernewbtn;
	
	@FindBy(xpath="//input[@name='title']")
	public static WebElement titlebtn;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Description')]/textarea")
	public static WebElement DescriptiontxtBox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Location')]/textarea")
	public static WebElement LocationtxtBox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Reminder Time')]/div[@class='ui input']/input")
	public static WebElement ReminderTimetxtBox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Identifier')]/div[@class='ui input']/input")
	public static WebElement IdentifiertxtBox;
	
	@FindBy(xpath="//div[@name='category']/div[contains(@class, 'divider')]")
	public static WebElement category;
	
	@FindBy(xpath="//div[contains(@class,'item')]/button[@class='ui linkedin button']")
	public static WebElement savebtn;
}
