package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class DeleteAssetPageTest extends BaseTest{

	@Test
	public void deleteAsset() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("Nusername"), prop.getProperty("password1"));
		employeesPage.deleteAsset();
	}
}
