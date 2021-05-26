package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteWorksheetPageTest extends BaseTest{

	@Test
	public void deleteWorksheet() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		circularPage.deleteWorksheet();
	}
}
