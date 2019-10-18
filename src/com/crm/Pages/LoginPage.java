package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class LoginPage {
	
@FindBy(xpath="//input[@id='userName']") private WebElement unTB;
	
	public void setUsername(String un) throws Throwable {
		unTB.sendKeys(un);
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//input[@id='passWord']") private WebElement pwTB;
	public void setPassword(String pwd) throws Throwable {
		pwTB.sendKeys(pwd);
		
	}
	
	@FindBy(xpath="//input[@src='/crm/images/btnSignIn.gif']") private WebElement loginBtn;
	public WebElement getUnTB() {
		return unTB;
		
	}

	//abcd

	

	
	public void clickLogin() {
		loginBtn.click();
		
	}
	
	
	public void login(String un,String pwd) {
		unTB.sendKeys(un);
		pwTB.sendKeys(pwd);
		loginBtn.click();
	}
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

}
