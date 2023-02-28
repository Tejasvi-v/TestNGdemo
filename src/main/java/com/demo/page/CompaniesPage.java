package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class CompaniesPage extends TestBase
{

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
	
	@FindBy (xpath="//input[@name='num_employees']")
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
	
	@FindBy(xpath="//input[@name='fileField']")
	public static WebElement ImagetxtBox;
	
	
	public static void companies() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebDriverWait wait =new WebDriverWait (driver, 10000);
		wait.until(ExpectedConditions.elementToBeClickable(CompaniesPage.Companiesmenu));
		CompaniesPage.Companiesmenu.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		CompaniesPage.CompaniescreateBtn.click();
		CompaniesPage.NametxtBox.sendKeys("Tejasvi");
		CompaniesPage.WebsitetxtBox.sendKeys("https://www.facebook.com");
		CompaniesPage.AddresstxtBox.sendKeys("Edison");
		CompaniesPage.CitytxtBox.sendKeys("NJ");
		CompaniesPage.StatetxtBox.sendKeys("New York");
		CompaniesPage.PostalcodetxtBox.sendKeys("61093");
		CompaniesPage.AddiconBtn.click();
		CompaniesPage.AddresstxtBtn1.sendKeys("Ohio");
		CompaniesPage.CitytxtBox1.sendKeys("DC");
		CompaniesPage.StatetxBox1.sendKeys("Calforina");
		CompaniesPage.PostalcodetxtBox1.sendKeys("64554");
		CompaniesPage.NumbertxtBox.sendKeys("734543534");
		CompaniesPage.HometxtBox.sendKeys("734534534");
		CompaniesPage.DescriptiontxtBox.sendKeys("Updated the New Companies for data restored");
		CompaniesPage.TwittertxtBox.sendKeys("Tejasviteju_96");
		CompaniesPage.IndustrytxtBox.sendKeys("IT Technology");
		CompaniesPage.NoofemployeestxtBox.sendKeys("3000");
		CompaniesPage.symboltxtBox.sendKeys("@#@!");
		CompaniesPage.AnnualRevenuetxtBox.sendKeys("100 Million");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'High';",
				CompaniesPage.PrioritydropdownBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Active';",
				CompaniesPage.StatusdropdownBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Partner';",
				CompaniesPage.SourcedropdownBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Client';",
				CompaniesPage.CategorydropdownBox);
		CompaniesPage.VATNumbertxtBox.sendKeys("46346346");
		CompaniesPage.IdentifiertxtBox.sendKeys("New Company");
		CompaniesPage.ImagetxtBox.sendKeys("C://Users//Teju//Pictures//Saved Pictures//FreeCRM.png");
		driver.close();
	}
	
}
