package com.OrangeHRM.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is  "+e.getMessage());
		}
	}
	public String getHRMURL()
	{
		String url = prop.getProperty("URL");
		return url;
	}
	
	public String getUsername()
	{
		String user = prop.getProperty("username");
		return user;
	}
	
	public String getPassword() {
		String passwd = prop.getProperty("password");
		return passwd;
	}
	
	
}
