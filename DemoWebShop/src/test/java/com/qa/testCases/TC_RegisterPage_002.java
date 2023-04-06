package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;
import com.qa.pages.RegistrationPage;

public class TC_RegisterPage_002 extends BaseClass {

	@Test(priority = 1) // priority= helps in executing the test cases in that order
	public void Test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001(); // reference objec=address that indicates where
		tc1.linkTest(); // an object's variables and methods are stored.
	}

	@Test(priority = 2)
	public void test2() {
		RegistrationPage registrationPage = new RegistrationPage(driver);

		registrationPage.registerUser("Ashwini", "Sidral", "ashwinisidral20@gmail.com");
		
		registrationPage.userPassword("Ashu@1822", "Ashu@1822");
		
		registrationPage.register();

	}
	
	@Test(priority = 3)
	public void testUserVerify() {
		RegistrationPage registrationPage = new RegistrationPage(driver);

		String actualUser = registrationPage.user();
		System.out.println(" Actual User name is = "+actualUser);
		
		String expectUser = "ashwinisidral20@gmail.com";
		System.out.println(" Expected User name is = "+actualUser);

		Assert.assertNotEquals(actualUser, expectUser);
		
	}

}
