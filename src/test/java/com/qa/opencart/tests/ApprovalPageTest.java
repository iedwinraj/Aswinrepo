package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ApprovalPageTest extends BaseTest{

	@Test
	public void doApproval() {
		
		loginPage.doLogin(prop.getProperty("NSPIRAusername"), prop.getProperty("NSPIRApassword"));
		buildingPage.doApproval();
	}
}
