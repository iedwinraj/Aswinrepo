package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditBSSPageTest extends BaseTest{

	@Test
	public void editBSS() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		schoolmanagementPage.editBSS();
	}
}
