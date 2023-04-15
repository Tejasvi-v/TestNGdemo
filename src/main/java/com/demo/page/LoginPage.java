package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class LoginPage extends TestBase
{

	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	public static WebElement login;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement userNameTxtBox;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement passwordTxtBox;
	
	@FindBy(xpath="//div[contains(@class, 'submit') and contains(., 'Login')]")
	public static WebElement loginBtn;
	
	
	public static void Login() throws InterruptedException
	{
		WebDriverWait wait =new WebDriverWait(driver, 20000);
		/*wait.until(ExpectedConditions.elementToBeClickable(LoginPage.login));
		LoginPage.login.click();*/
		LoginPage.userNameTxtBox.sendKeys("praveendev404@gmail.com");
		LoginPage.passwordTxtBox.sendKeys("Test1111$");
		Thread.sleep(2000);
		LoginPage.loginBtn.click();
	}
	
	
	
}

