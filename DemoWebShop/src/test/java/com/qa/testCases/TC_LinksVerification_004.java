package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_LinksVerification_004 extends BaseClass{

	@Test
	public void Test1(){
		TC_linkTest_001 tc1 = new TC_linkTest_001();           // reference objec=address that indicates where
		tc1.linkTest();                                        // an object's variables and methods are stored.
	}
	
	@Test
	public void Test2() {
		HomePage homePage = new HomePage(driver);
		homePage.verifyLinks();
		
		int expectLinks = 95;
		System.out.println(" expectLinks = "+expectLinks);
		int actualLinks = homePage.linkCounts();
		System.out.println(" actualLinks "+actualLinks);
		Assert.assertEquals(expectLinks,actualLinks);
		
	}
	
	@Test
	public void Test3() {
		HomePage homePage = new HomePage(driver);
		int display = homePage.displayLinks();
		System.out.println(" display links count = "+display);
	}

}
