package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditCTAPageTest extends BaseTest{

	@Test
	public void editCTA() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		schoolmanagementPage.editCTA();
	}
}
