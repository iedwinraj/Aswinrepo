package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteCOMPageTest extends BaseTest{

	@Test
	public void deleteCOM() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		administrationPage.deleteCOM();
	}
}
