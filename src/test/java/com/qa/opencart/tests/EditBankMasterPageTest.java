package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditBankMasterPageTest extends BaseTest{
	
	@Test
	public void editBankMaster() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("NVP"), prop.getProperty("Npassword"));
		feesmanagementPage.editBankMaster();
	}
}
