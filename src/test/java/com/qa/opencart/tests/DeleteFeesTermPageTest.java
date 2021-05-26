package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteFeesTermPageTest extends BaseTest{

	@Test
	public void deleteFeesTerm() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		feesmanagementPage.deleteFeesTerm();
	}
}
