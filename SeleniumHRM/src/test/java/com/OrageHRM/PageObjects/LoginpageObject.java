package com.OrageHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageObject {

	WebDriver ldriver;
	
	
	public LoginpageObject(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	public void setusername(String user)
	{
		username.sendKeys(user);
	}
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(id = "btnLogin")
	WebElement loginbtn;
	
	public void clickLogin()
	{
		loginbtn.click();
	}
}

