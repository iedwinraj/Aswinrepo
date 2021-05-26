package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteRelegionPageTest extends BaseTest{

	@Test
	public void deleteRelegion() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		administrationPage.deleteRelegion();
	}
}
