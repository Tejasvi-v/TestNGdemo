package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.base.TestBase;

public class DealPage extends TestBase{
	
	@FindBy(xpath="//a[contains(@href,'deals')]")
	public static WebElement dealmenu;
	
	@FindBy(xpath="//a[contains(@href,'deals/new')]")
	public static WebElement dealnewbtn;

	@FindBy(xpath="//input[@name='title']")
	public static WebElement titlebtn;
	
	@FindBy(xpath="//div//label[text()='Assigned To']/parent::div//div[contains(@class, 'divider text')]")
	public static WebElement assignedtobtn;
	
	@FindBy(xpath="//div//textarea[contains(@name, 'description')]")
	public static WebElement descriptiontxtBox;
	
	@FindBy(xpath="//input[@name='probability']")
	public static WebElement probabilitytxtBox;
	
	@FindBy(xpath="//input[@name='amount']")
	public static WebElement amounttxtBox;
	
	@FindBy(xpath="//input[@name='commission']")
	public static WebElement commissiontxtBox;
	
	@FindBy(xpath="//div[@name='stage']/div[contains(@class, 'divider default text')]")
	public static WebElement stagetxtBox;
	
	@FindBy(xpath="//input[@name='closed']")
	public static WebElement closedBtn;
	
	@FindBy(xpath="//div[@name='status']/div[contains(@class, 'divider default text')]")
	public static WebElement statustxtBox;
	
	@FindBy(xpath="//textarea[@name='next_step']")
	public static WebElement nextstepstxtBox;
	
	@FindBy(xpath="//div[@name='type']/div[contains(@class, 'divider default text')]")
	public static WebElement typetxtBox;
	
	@FindBy(xpath="//div[@name='source']/div[contains(@class, 'divider default text')]")
	public static WebElement sourcetxtBox;
	
	@FindBy(xpath="//input[@name='identifier']")
	public static WebElement identifiertxtBox;
	
	@FindBy(xpath="//div[contains(@class,'item')]/button[@class='ui linkedin button']")
	public static WebElement savebtn;
	
	
	public static void deal() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		DealPage.dealmenu.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		DealPage.dealnewbtn.click();
		DealPage.titlebtn.sendKeys("Company Deals");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Praveen Banda';",
				DealPage.assignedtobtn);
		DealPage.descriptiontxtBox.sendKeys("Updated the Deals for data restored");
		DealPage.probabilitytxtBox.sendKeys("100");
		DealPage.amounttxtBox.sendKeys("3000");
		DealPage.commissiontxtBox.sendKeys("10000");
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Research';",
				DealPage.stagetxtBox);
		executor.executeScript("document.getElementsByName('closed')[0].click();");
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Terminated';",
				DealPage.statustxtBox);
		DealPage.nextstepstxtBox.sendKeys("Proceed to Next Screens");
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Priority';",
				DealPage.typetxtBox);
		executor.executeScript("var ele=arguments[0]; ele.innerHTML = 'Word of mouth';",
				DealPage.sourcetxtBox);
		DealPage.identifiertxtBox.sendKeys("Approved");
		DealPage.savebtn.click();
		driver.close();
	}
	
	
}
