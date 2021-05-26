package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class FeesTypePageTest extends BaseTest{

	@Test
	public void feesType() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		feesmanagementPage.feesType();
	}
}
