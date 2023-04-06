package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TC_linkTest_001 extends BaseClass{

	@Test
	public void linkTest() {
		driver.get("https://demowebshop.tricentis.com/");
	}
}
