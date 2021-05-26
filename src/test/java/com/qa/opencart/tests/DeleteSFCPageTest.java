package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteSFCPageTest extends BaseTest{

	@Test
	public void deleteSFC() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		feesmanagementPage.deleteSFC();
	}
}
