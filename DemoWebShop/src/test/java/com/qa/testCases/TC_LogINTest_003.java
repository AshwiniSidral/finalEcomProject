package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class TC_LogINTest_003 extends BaseClass{

	
	public LoginPage loginPage;
	@Test(priority = 1)                 // priority= helps in executing the test cases in that order
	public void Test1()
	{
		TC_linkTest_001 tc1 = new TC_linkTest_001();           // reference object=address that indicates where
		tc1.linkTest();                                        // an object's variables and methods are stored.
	}

	@Test(priority = 2)
    public void test2()
	{
		loginPage=new LoginPage(driver);
		loginPage.loginCredentials("akshaysidral@gmail.com","Ashu@1822");
    	loginPage.logIn();
    }
    
	@Test(priority = 3)
	public void validUser() 
	{
		loginPage=new LoginPage(driver);
		
		String actualUserId = loginPage.accountVerify();
		System.out.println("actual user id = "+actualUserId);
	
		String expectedUserId="akshaysidral@gmail.com";
		System.out.println("expected user id = "+expectedUserId);
	
		Assert.assertEquals(actualUserId, expectedUserId);
	}
	
	@Test(priority = 4)
	public void inValidUser() 
	{
		loginPage=new LoginPage(driver);
		
		String actualUserId=loginPage.accountVerify();
		System.out.println("actual user id = "+actualUserId);
	
		String expectedUserId="akshaysidral123@gmail.com";
		System.out.println("expected user id = "+expectedUserId);
	
		Assert.assertNotEquals(actualUserId, expectedUserId);
	}




}



