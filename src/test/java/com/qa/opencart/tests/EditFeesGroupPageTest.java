package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditFeesGroupPageTest extends BaseTest{

	@Test
	public void editFeesGroup() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("NVP"), prop.getProperty("Npassword"));
		feesmanagementPage.editFeesGroup();
	}
}
