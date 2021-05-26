package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditSFCPageTest extends BaseTest{

	@Test
	public void editSFC() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		feesmanagementPage.editSFC();
	}
}
