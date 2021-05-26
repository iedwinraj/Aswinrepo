package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteDesignationPageTest extends BaseTest{

	@Test
	public void deleteDesignation() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		employeesPage.deleteDesignation();
	}
}
