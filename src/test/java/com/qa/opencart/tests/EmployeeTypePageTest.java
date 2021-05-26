package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EmployeeTypePageTest extends BaseTest{

	@Test
	public void createET() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		employeesPage.createET();
	}
}
