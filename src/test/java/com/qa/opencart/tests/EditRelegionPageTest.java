package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditRelegionPageTest extends BaseTest{

	@Test
	public void editRelegion() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		administrationPage.editRelegion();
	}
}
