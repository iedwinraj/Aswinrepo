package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class FeesHeadPageTest extends BaseTest{

	@Test
	public void feesHead() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		feesmanagementPage.feesHead();
	}
}
