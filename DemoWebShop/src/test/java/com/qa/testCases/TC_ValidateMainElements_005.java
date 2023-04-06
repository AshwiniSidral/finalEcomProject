package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_ValidateMainElements_005 extends BaseClass{

	@Test
	public void Test1(){
		TC_linkTest_001 tc1 = new TC_linkTest_001();           // reference object=address that indicates where
		tc1.linkTest();                                        // an object's variables and methods are stored.
	}
	

	@Test
	public void Test2(){
		HomePage homePage = new HomePage(driver);
		homePage.validateTexts();
		
	}
	
	@Test
	public void Test3(){
		HomePage homePage = new HomePage(driver);
		homePage.validateTexts();
		
		int expect= 7;
		System.out.println(" expectLinks = "+expect);
		int actual = homePage.elementCounts();
		System.out.println(" actualLinks "+actual);
		Assert.assertEquals(expect,actual);
	}
}
