package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteDCAPageTest extends BaseTest{

	@Test
	public void deleteDCA() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		studentmanagementPage.deleteDCA();
	}
}
