package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class BuildingPageTest extends BaseTest{

	@Test
	public void doBuilding() {
		
		loginPage.doLogin(prop.getProperty("NSPIRAusername"), prop.getProperty("NSPIRApassword"));
		buildingPage.doBuilding();
	}
}
