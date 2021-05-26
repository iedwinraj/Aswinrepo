package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditStatePageTest extends BaseTest{

	@Test
	public void editState() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		administrationPage.editState();
	}
}
