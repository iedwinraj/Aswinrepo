package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditUserPageTest extends BaseTest{

	@Test
	public void editUser() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		administrationPage.editUser();
	}
}
