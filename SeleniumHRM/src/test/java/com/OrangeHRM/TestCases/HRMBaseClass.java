package com.OrangeHRM.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.OrangeHRM.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMBaseClass {

	ReadConfig read = new ReadConfig();
	
	public String urlHRM = read.getHRMURL();
	public String username = read.getUsername();
	public String password = read.getPassword();
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(urlHRM);
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
