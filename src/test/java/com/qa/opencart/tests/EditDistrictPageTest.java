package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditDistrictPageTest extends BaseTest{

	@Test
	public void editDistrict() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"),prop.getProperty("Npassword"));
		administrationPage.editDistrict();
	}
}
