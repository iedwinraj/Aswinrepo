package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SiblingFeesConcessionPageTest extends BaseTest{

	@Test
	public void sfc() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		feesmanagementPage.siblingfeesConcession();
	}
}
