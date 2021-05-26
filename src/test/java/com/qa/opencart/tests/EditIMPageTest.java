package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class EditIMPageTest extends BaseTest{

	@Test
	public void editIM( ) {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Principalusername"), prop.getProperty("Npassword"));
		incidentPage.editIM();
	}
}
