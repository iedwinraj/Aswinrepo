package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditFeesHeadPageTest extends BaseTest{

	@Test
	public void editFeesHead() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("NVP"), prop.getProperty("Npassword"));
		feesmanagementPage.editFeesHead();
	}
}
