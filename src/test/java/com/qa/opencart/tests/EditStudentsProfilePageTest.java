package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditStudentsProfilePageTest extends BaseTest{

	@Test
	public void editStudentsProfile() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("Npassword"));
		studentmanagementPage.editStudentsProfile();
	}
}
