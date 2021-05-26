package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditGroupPageTest extends BaseTest{

	@Test
	public void editGroup() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("NVP"), prop.getProperty("Npassword"));
		circularPage.editGroup();
	}
}
