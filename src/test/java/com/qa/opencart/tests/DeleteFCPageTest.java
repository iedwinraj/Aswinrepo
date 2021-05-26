package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteFCPageTest extends BaseTest{

	@Test
	public void deleteFC() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		feesmanagementPage.deleteFC();
	}
}
