package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditARSPageTest extends BaseTest{

	@Test
	public void editARS() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Principalusername"), prop.getProperty("Npassword"));
		storiesPage.editARS();
	}
}
