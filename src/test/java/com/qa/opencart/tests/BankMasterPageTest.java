package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class BankMasterPageTest extends BaseTest{

	@Test
	public void addbank() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		feesmanagementPage.bankMaster();
	}
}
