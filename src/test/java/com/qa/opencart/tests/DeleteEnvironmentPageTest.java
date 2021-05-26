package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteEnvironmentPageTest extends BaseTest{

	@Test
	public void deleteEnvironment() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		schoolmanagementPage.deleteEnvironment();
	}
}
