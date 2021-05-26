package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DesignationPageTest extends BaseTest{

	@Test
	public void createDesignation() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		employeesPage.createDesignation();
	}
}
