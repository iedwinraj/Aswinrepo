package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditEFMPageTest extends BaseTest{

	@Test
	public void editEFM() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		administrationPage.editEFM();
	}
}
