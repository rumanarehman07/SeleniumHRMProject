package com.OrangeHRM.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.OrageHRM.PageObjects.LoginpageObject;

public class LoginPageTest extends HRMBaseClass {

	LoginpageObject loginpage = new LoginpageObject(driver);
	

@Test
public void loginTest1_01() throws Exception
{
	
	loginpage.setusername(username);
	Thread.sleep(3000);
	loginpage.setPassword(password);
	loginpage.clickLogin();
	Thread.sleep(4000);
	String TitleDash = driver.getTitle();
	
	if(TitleDash.equalsIgnoreCase("OrangeHRM"))
	{
		Assert.assertTrue(true);
		System.out.println("successfull");
	}
	else
	{
		Assert.assertFalse(false);
		System.out.println("Not successfull");
	}
}

	
	
}
