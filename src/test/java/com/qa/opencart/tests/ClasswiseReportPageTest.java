package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ClasswiseReportPageTest extends BaseTest{

	@Test
	public void doCR() {
		
		loginPage.doSelect();
		loginPage.doLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		studentmanagementPage.doCR();
	}
}
