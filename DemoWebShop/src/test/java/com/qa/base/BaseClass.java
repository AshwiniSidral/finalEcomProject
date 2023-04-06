package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//base class contain setup and tear down method
	
	/*
	 * ==BaseClass==
	 With base class you can avoid code duplication and can reuse the code as much you want. 
	 Base Class works with Selenium in following manner: 
	 When we create base class and if TestCases extends BaseClass then we can use all the methods of Baseclass.
	 * 
	 * */
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
			}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
