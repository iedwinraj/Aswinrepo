package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditHousePageTest extends BaseTest{

	@Test
	public void editHouse() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("Npassword"));
		schoolmanagementPage.editHouse();
	}
}
