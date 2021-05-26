package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class FeesGroupPageTest extends BaseTest{

	@Test
	public void feesGroup() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		feesmanagementPage.feesGroup();
	}
}
