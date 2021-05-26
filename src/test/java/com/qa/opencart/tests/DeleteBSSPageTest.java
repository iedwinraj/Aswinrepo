package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteBSSPageTest extends BaseTest{

	@Test
	public void deleteBSS() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		schoolmanagementPage.deleteBSS();
	}
}
