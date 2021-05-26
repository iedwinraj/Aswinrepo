package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteDepartmentPageTest extends BaseTest{

	@Test
	public void deleteDepartment() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		employeesPage.deleteDepartment();
	}
}
