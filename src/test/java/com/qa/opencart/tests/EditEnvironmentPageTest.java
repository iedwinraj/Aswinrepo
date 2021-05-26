package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditEnvironmentPageTest extends BaseTest{

	@Test
	public void editEnvironment() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("NVP"), prop.getProperty("Npassword"));
		schoolmanagementPage.editEnvironemnt();
	}
}
