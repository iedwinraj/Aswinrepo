package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditOrganizationPageTest extends BaseTest{

	@Test
	public void editOrg() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		administrationPage.editOrg();
	}
}
