package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteEFMPageTest extends BaseTest{

	@Test
	public void deleteEFM() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		administrationPage.deleteEFM();
	}
}
