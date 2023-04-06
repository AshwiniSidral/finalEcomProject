package com.qa.base;

import java.io.FileReader;
import java.util.Properties;

public class ReadConfigure{
	 Properties  properties;
	
	public ReadConfigure()
	{
		try {
		FileReader reader = new FileReader(".\\src\\test\\resources\\config.properties");
		properties= new Properties();
		properties.load(reader);
			
		
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
	
	
	public String  getBrowser()
	{
	 return	properties.getProperty("browser");
	}
	
	
	public String  getUrl()
	{
	 return	properties.getProperty("url");
	}
	
	

	public String  getUsername()
	{
	 return	properties.getProperty("username");
	}
	

	public String  getPassword()
	{
	 return	properties.getProperty("password");
	}
	
	

}

