package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompaniesPageObjects {

	@FindBy(xpath="//a[contains(@href,'companies')]/span")
	public static WebElement Companiesmenu;
	
	@FindBy(xpath="//a[contains(@href, 'companies/new')]")
	public static WebElement CompaniescreateBtn;
	
	@FindBy(xpath="//label[text()='Name']/following-sibling::div//input")
	public static WebElement NametxtBox;
	
	@FindBy(xpath="//label[text()='Website']/following-sibling::div//input")
	public static WebElement WebsitetxtBox;
	
	@FindBy(xpath="//button[text()='Fetch']")
	public static WebElement FetchBtn;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][1]//input[@name='address']")
	public static WebElement AddresstxtBox;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][1]//input[@name='city']")
	public static WebElement CitytxtBox;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][1]//input[@name='state']")
	public static WebElement StatetxtBox;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][1]//input[@name='zip']")
	public static WebElement PostalcodetxtBox;
	
	@FindBy(xpath="//button/i[@class='add icon']")
	public static WebElement AddiconBtn;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][2]//input[@name='address']")
	public static WebElement AddresstxtBtn1;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][2]//input[@name='city']")
	public static WebElement CitytxtBox1;
	
	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][2]//input[@name='state']")
	public static WebElement StatetxBox1;

	@FindBy(xpath="//div//label[contains(text(),'Address')]/parent::div//div[@class='fields'][2]//input[@name='zip']")
	public static WebElement PostalcodetxtBox1;
	
	@FindBy(xpath="//div//label[contains(text(),'Phone')]/parent::div//div[@class='ui input']//input[@placeholder='Number']")
	public static WebElement NumbertxtBox;
	
	@FindBy(xpath="//div//label[contains(text(),'Phone')]/parent::div//div[@class='ui input']//input[@placeholder='Home, Work, Mobile...']")
	public static WebElement HometxtBox;
	
	@FindBy(xpath="//div[@class='ui field' and contains (., 'Description')]/textarea")
	public static WebElement DescriptiontxtBox;
	
	@FindBy(xpath="//input[@placeholder='Twitter handle']")
	public static WebElement TwittertxtBox;
	
	@FindBy(xpath="//input[@name='industry']")
	public static WebElement IndustrytxtBox;
	
	@FindBy(xpath="//input[@name='num_employees']")
	public static WebElement NoofemployeestxtBox;
	
	@FindBy(xpath="//input[@name='symbol']")
	public static WebElement symboltxtBox;
	
	@FindBy(xpath="//input[@name='annual_revenue']")
	public static WebElement AnnualRevenuetxtBox;
	
	@FindBy(xpath="//div[@name='priority']/div[contains(@class, 'divider')]")
	public static WebElement PrioritydropdownBox;
	
	@FindBy(xpath="//div[@name='status']/div[contains(@class, 'divider')]")
	public static WebElement StatusdropdownBox;
	
	@FindBy(xpath="//div[@name='source']/div[contains(@class, 'divider')]")
	public static WebElement SourcedropdownBox;
	
	@FindBy(xpath="//div[@name='category']/div[contains(@class, 'divider')]")
	public static WebElement CategorydropdownBox;
	
	@FindBy(xpath="//div//label[contains(text(),'VAT Number')]/parent::div//div[@class='ui input']//input[@name='vat_number']")
	public static WebElement VATNumbertxtBox;
	
	@FindBy(xpath="//div//label[contains(text(),'Identifier')]/parent::div//div[@class='ui input']//input[@name='identifier']")
	public static WebElement IdentifiertxtBox;
	
	
	
	
}
