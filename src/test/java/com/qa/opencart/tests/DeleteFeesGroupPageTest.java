package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteFeesGroupPageTest extends BaseTest{

	@Test
	public void deleteFeesGroup() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		feesmanagementPage.deleteFeesGroup();
	}
}
