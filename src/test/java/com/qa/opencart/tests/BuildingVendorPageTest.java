package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class BuildingVendorPageTest extends BaseTest{

	@Test
	public void buildingVendor() {
		
		loginPage.doLogin(prop.getProperty("NSPIRAusername"), prop.getProperty("NSPIRApassword"));
		buildingPage.buildingVendor();
	}
}
