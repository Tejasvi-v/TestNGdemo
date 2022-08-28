package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement login;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement userNameTxtBox;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement passwordTxtBox;
	
	@FindBy(xpath="//div[contains(@class, 'submit') and contains(., 'Login')]")
	public static WebElement loginBtn;
}
