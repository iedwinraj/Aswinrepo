package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class FamilyRelationshipsPageTest extends BaseTest{

	@Test
	public void createFR() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		employeesPage.createFR();
	}
}
