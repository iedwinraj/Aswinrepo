package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteHousePageTest extends BaseTest{

	@Test
	public void deleteHouse() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		schoolmanagementPage.deleteHouse();
	}
}
